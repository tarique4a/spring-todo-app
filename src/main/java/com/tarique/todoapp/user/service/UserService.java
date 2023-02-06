package com.tarique.todoapp.user.service;

import com.tarique.todoapp.todo.entity.TodoEntity;
import com.tarique.todoapp.todo.repository.TodoRepo;
import com.tarique.todoapp.user.entity.UserEntity;
import com.tarique.todoapp.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private TodoRepo todoRepo;

    public UserEntity getUserById(String id){
        return userRepo.findById(id).get();
    }

    public String createUser(UserEntity newUser){
        userRepo.save(newUser);
        return "User Created Successfully";
    }

    public String createTodoByUserId(TodoEntity newTodo, String userId){
        UserEntity dbUser = userRepo.findById(userId).get();
        TodoEntity dbTodo = todoRepo.save(newTodo);
        dbUser.addTodo(dbTodo);
        userRepo.save(dbUser);
        return "Todo Added";
    }
}
