package com.tarique.todoapp.user.controller;

import com.tarique.todoapp.todo.entity.TodoEntity;
import com.tarique.todoapp.user.entity.UserEntity;
import com.tarique.todoapp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public UserEntity getUserById( @PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/")
    public String createUser(@RequestBody UserEntity newUser){
        return userService.createUser(newUser);
    }

    @PostMapping("/createtodo/{id}")
    public String createTodo(@RequestBody TodoEntity newTodo, @PathVariable String id){
        return userService.createTodoByUserId(newTodo,id);
    }

}
