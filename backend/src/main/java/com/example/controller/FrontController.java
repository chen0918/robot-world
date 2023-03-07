package com.example.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin
@RequestMapping("/")
public class FrontController {
    @GetMapping("/")
    public void index(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        resp.sendRedirect("/index.html");
    }
}
