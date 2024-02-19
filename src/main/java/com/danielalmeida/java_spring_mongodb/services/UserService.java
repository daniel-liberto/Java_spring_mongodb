package com.danielalmeida.java_spring_mongodb.services;

import com.danielalmeida.java_spring_mongodb.domain.User;
import com.danielalmeida.java_spring_mongodb.repositories.UserRepository;
import com.danielalmeida.java_spring_mongodb.services.exception.ObjectNotFoundException;
import com.sun.jdi.ObjectCollectedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }
  public User findById(String id){
    return userRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found."));
  }
}
