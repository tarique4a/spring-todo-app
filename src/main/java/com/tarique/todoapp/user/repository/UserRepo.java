package com.tarique.todoapp.user.repository;

import com.tarique.todoapp.user.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserEntity,String> {
}
