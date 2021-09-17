package com.anderson.todolist.services;

import java.util.List;
import java.util.Optional;

import com.anderson.todolist.domain.Todo;
import com.anderson.todolist.repositories.TodoRepository;
import com.anderson.todolist.services.exceptions.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    
    @Autowired
    private TodoRepository repository;

    public List<Todo> FindAll() {
        List<Todo> list = repository.findAll();
        return list;
    }

    public List<Todo> FindAllOpen() {
        List<Todo> list = repository.findAllOpen();
        return list;
    }

    public List<Todo> FindAllClose() {
        List<Todo> list = repository.findAllClose();
        return list;
    }

    public Todo findById(Integer id) {
        Optional<Todo> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Todo.class.getName()));
    }

    public Todo create(Todo obj) {
        obj.setId(null);
        return repository.save(obj);
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }

    public Todo update(Integer id, Todo obj) {
        Todo newObj = findById(id);
        newObj.setTitle(obj.getTitle());
        newObj.setDescription(obj.getDescription());
        newObj.setFinalDate(obj.getFinalDate());
        newObj.setFinished((obj.getFinished()));
        return repository.save(newObj);
    }
}
