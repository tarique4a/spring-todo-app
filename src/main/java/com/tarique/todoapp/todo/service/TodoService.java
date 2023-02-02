package com.tarique.todoapp.todo.service;

import com.tarique.todoapp.todo.entity.TodoEntity;
import com.tarique.todoapp.todo.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    public List<TodoEntity> getTodos(){
        return todoRepo.findAll();
    }

    public List<TodoEntity> addTodo(TodoEntity newTodo){
        todoRepo.save(newTodo);
        return getTodos();
    }

    public List<TodoEntity> updateTodo(TodoEntity editTodo,String id){
        if(todoRepo.existsById(id)) {
            editTodo.setId(id);
            todoRepo.save(editTodo);
        }
        return getTodos();

    }

    public List<TodoEntity> deleteTodo(String id){
        if(todoRepo.existsById(id)){
            todoRepo.deleteById(id);
        }
        return getTodos();
    }

}
