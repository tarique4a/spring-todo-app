package com.tarique.todoapp.user.entity;

import com.tarique.todoapp.todo.entity.TodoEntity;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import java.util.ArrayList;
import java.util.List;

@EntityScan
public class UserEntity  {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;

    private List<TodoEntity> todos;


    public UserEntity(String id, String username, String email, String password, List<TodoEntity> todos) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.todos = todos;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassWord(String password) {
        this.password = password;
    }


    public List<TodoEntity> getTodos() {
        return todos;
    }

    public void setTodos(List<TodoEntity> todos) {
        this.todos = todos;
    }

    public void addTodo(TodoEntity newTodo){
        if(this.todos == null){
            this.todos = new ArrayList<TodoEntity>();
        }
        this.todos.add(newTodo);
    }
}

