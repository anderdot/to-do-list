package com.anderson.todolist.configuration;

import com.anderson.todolist.services.DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Autowired
    private DBService dbService;

    @Bean
    public boolean instance() {
        this.dbService.instanceDataBase();
        return true;
    }
}