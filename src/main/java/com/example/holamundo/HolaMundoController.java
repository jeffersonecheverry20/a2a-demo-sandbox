package com.example.holamundo;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class HolaMundoController {

    public static final String PATH = "/hola";
    public static final String MESSAGE = "Hola Mundo";

    public static HttpServer createServer(int port) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext(PATH, HolaMundoController::handle);
        server.start();
        return server;
    }

    static void handle(HttpExchange exchange) throws IOException {
        try {
            if (!"GET".equalsIgnoreCase(exchange.getRequestMethod())) {
                send(exchange, 405, "Method Not Allowed");
                return;
            }
            send(exchange, 200, MESSAGE);
        } finally {
            exchange.close();
        }
    }

    private static void send(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        }
    }

    static boolean runSelfTest() throws IOException {
        HttpServer server = createServer(0);
        try {
            int port = server.getAddress().getPort();
            URL url = new URL("http://localhost:" + port + PATH);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            int code = conn.getResponseCode();
            String body = readAll(conn.getInputStream());
            conn.disconnect();
            return code == 200 && MESSAGE.equals(body);
        } finally {
            server.stop(0);
        }
    }

    private static String readAll(InputStream in) throws IOException {
        try (InputStream input = in) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] chunk = new byte[1024];
            int read;
            while ((read = input.read(chunk)) != -1) {
                buffer.write(chunk, 0, read);
            }
            return new String(buffer.toByteArray(), StandardCharsets.UTF_8);
        }
    }

    public static void main(String[] args) {
        try {
            if (args.length > 0 && "--selftest".equals(args[0])) {
                boolean ok = runSelfTest();
                System.out.println(ok ? "PASS: GET " + PATH + " returned 200 and '" + MESSAGE + "'"
                                      : "FAIL: unexpected response from GET " + PATH);
                System.exit(ok ? 0 : 1);
            } else {
                HttpServer server = createServer(8080);
                System.out.println("Listening on http://localhost:8080" + PATH);
                Runtime.getRuntime().addShutdownHook(new Thread(() -> server.stop(0)));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1);
        }
    }
}
