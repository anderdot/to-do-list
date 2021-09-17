package com.anderson.todolist.repositories;

import java.util.List;

import com.anderson.todolist.domain.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {

    @Query("SELECT obj FROM Todo obj WHERE obj.finished = false ORDER BY obj.finalDate")
    List<Todo> findAllOpen();

    @Query("SELECT obj FROM Todo obj WHERE obj.finished = true ORDER BY obj.finalDate")
    List<Todo> findAllClose();
}
