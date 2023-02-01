package com.tarique.todoapp.todo.controller;

import com.tarique.todoapp.todo.entity.TodoEntity;
import com.tarique.todoapp.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;
    @GetMapping("/")
    public List<TodoEntity> getTodos(){
        return todoService.getTodos();
    }

    @PostMapping("/")
    public List<TodoEntity> addTodo(@RequestBody TodoEntity newTodo){
        return todoService.addTodo(newTodo);
    }
@GetMapping("/test")
public String test(){
        return "hi working";
}
}
