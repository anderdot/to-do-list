package com.anderson.todolist.resources;

import com.anderson.todolist.domain.Todo;
import com.anderson.todolist.services.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/todos")
public class TodoResources {

    @Autowired
    private TodoService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Todo> findById(@PathVariable Integer id) {
        Todo todo = service.findById(id);
        return ResponseEntity.ok().body(todo);
    }
}
