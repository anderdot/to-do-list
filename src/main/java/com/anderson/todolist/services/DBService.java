package com.anderson.todolist.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import com.anderson.todolist.domain.Todo;
import com.anderson.todolist.repositories.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
	private TodoRepository todoRepository;
    
    public void instanceDataBase() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Todo todo = new Todo(null, "Estudar", "Estudar Spring Boot", LocalDateTime.parse("16/09/2021 01:19", formatter), false);

        todoRepository.saveAll(Arrays.asList(todo));
    }
}
