package com.anderson.todolist.services;

import java.util.Optional;

import com.anderson.todolist.domain.Todo;
import com.anderson.todolist.repositories.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository repository;

    public Todo findById(Integer id) {
        Optional<Todo> todo = repository.findById(id);
        return todo.orElse(null);
    }
}
