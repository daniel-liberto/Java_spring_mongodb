package com.danielalmeida.java_spring_mongodb.repositories;

import com.danielalmeida.java_spring_mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
