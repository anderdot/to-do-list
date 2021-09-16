package com.anderson.todolist.configuration;

import com.anderson.todolist.services.DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Autowired
    private DBService dbService;

    @Bean
    public boolean instance() {
        dbService.instanceDataBase();
        return true;
    }
}