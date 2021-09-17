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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Todo todo = new Todo(null, "Estudar", "Estudar Spring Boot", LocalDateTime.parse("16/09/2021 01:19", formatter), false);
        Todo todo1 = new Todo(null, "Reduzir gastos", "Cancelar Netflix", LocalDateTime.parse("16/09/2021 16:13", formatter), true);
        Todo todo2 = new Todo(null, "Luna!", "Passear com a cadelinha", LocalDateTime.parse("16/09/2021 01:14", formatter), false);
        Todo todo3 = new Todo(null, "Roupas no varal", "Tirar a roupa do varal antes de chover", LocalDateTime.parse("16/09/2021 01:16", formatter), true);

        todoRepository.saveAll(Arrays.asList(todo, todo1, todo2, todo3));
    }
}
