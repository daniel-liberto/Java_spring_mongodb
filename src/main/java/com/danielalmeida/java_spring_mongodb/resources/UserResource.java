package com.danielalmeida.java_spring_mongodb.resources;

import com.danielalmeida.java_spring_mongodb.domain.User;
import com.danielalmeida.java_spring_mongodb.dto.UserDTO;
import com.danielalmeida.java_spring_mongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  @Autowired
  private UserService service;
  @GetMapping
  public ResponseEntity<List<UserDTO>> findAll(){
    List<User> list = service.findAll();
    List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    return ResponseEntity.ok().body(listDTO);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<UserDTO> findById(@PathVariable String id){
    User obj = service.findById(id);
    return ResponseEntity.ok().body(new UserDTO(obj));
  }

  @PostMapping
  public ResponseEntity<Void> insert(@RequestBody UserDTO objDTO){
    User obj = service.fromDTO(objDTO);
    obj = service.insert(obj);
    URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
    return ResponseEntity.created(uri).build();
  }
}
