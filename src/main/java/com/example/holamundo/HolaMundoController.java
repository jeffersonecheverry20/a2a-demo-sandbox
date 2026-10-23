package com.example.holamundo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hola-mundo")
class SimpleHelloController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        response.setContentType("text/plain");
        try {
            response.getWriter().println("Hola Mundo");
        } catch (IOException e) {
            throw new ServletException("Failed to write response", e);
        }
    }
}