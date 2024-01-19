package com.example.securitymasterdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalErrorController {
    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model){
        model.addAttribute("message",ex.getMessage());
        return "error";
    }
}
