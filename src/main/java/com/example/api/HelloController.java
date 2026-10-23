package com.example.api;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface GetMapping {
        String value();
    }

    @GetMapping("/")
    public String getHelloWorld(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setStatus(200);
        return "hola mundo";
    }
}