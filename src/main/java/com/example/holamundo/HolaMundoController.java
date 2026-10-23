package com.example.holamundo;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

/**
 * Controller for the /holamundo route. Handles GET and POST requests;
 * any other HTTP method receives 405 Method Not Allowed.
 */
public class HolaMundoController {

    public static final String ROUTE = "/holamundo";
    public static final String GREETING = "Hola Mundo";

    /** Handles GET requests to the route. */
    public String handleGet() {
        return GREETING;
    }

    /** Handles POST requests to the route, echoing the trimmed request body. */
    public String handlePost(String body) {
        String content = body == null ? "" : body.trim();
        return GREETING + ": " + content;
    }

    /**
     * Creates and starts an HTTP server exposing the controller route.
     * Pass port 0 to bind to an ephemeral port.
     */
    public HttpServer start(int port) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext(ROUTE, this::dispatch);
        server.start();
        return server;
    }

    private void dispatch(HttpExchange exchange) throws IOException {
        String method = exchange.getRequestMethod();
        int status;
        String response;

        if ("GET".equalsIgnoreCase(method)) {
            status = 200;
            response = handleGet();
        } else if ("POST".equalsIgnoreCase(method)) {
            String body = new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8);
            status = 200;
            response = handlePost(body);
        } else {
            status = 405;
            response = "Method Not Allowed";
            exchange.getResponseHeaders().add("Allow", "GET, POST");
        }

        byte[] bytes = response.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().add("Content-Type", "text/plain; charset=utf-8");
        exchange.sendResponseHeaders(status, bytes.length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(bytes);
        }
    }
}
