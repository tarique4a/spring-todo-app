package com.tarique.todoapp.todo.repository;

import com.tarique.todoapp.todo.entity.TodoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends MongoRepository<TodoEntity,String> {
}
