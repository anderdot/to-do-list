package com.anderson.todolist.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Test 
{
    @GetMapping(value="/")
    public String getMethodName() {
        return "Olá Mundo";
    }
}