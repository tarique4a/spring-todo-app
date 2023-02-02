package com.tarique.todoapp.todo.controller;

import com.tarique.todoapp.todo.entity.TodoEntity;
import com.tarique.todoapp.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;
    @GetMapping("/get")
    public List<TodoEntity> getTodos(){
        return todoService.getTodos();
    }

    @PostMapping("/post")
    public List<TodoEntity> addTodo(@RequestBody TodoEntity newTodo){
        return todoService.addTodo(newTodo);
    }

    @PutMapping("/update/{id}")
    public List<TodoEntity> updateTodo(@RequestBody TodoEntity editTodo, @PathVariable("id") String id){
        return todoService.updateTodo(editTodo,id);
    }

    @DeleteMapping("/delete/{id}")
    public List<TodoEntity> deleteTodo(@PathVariable String id)
    {
        return todoService.deleteTodo(id);
    }




}
