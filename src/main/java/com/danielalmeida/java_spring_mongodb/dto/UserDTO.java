package com.danielalmeida.java_spring_mongodb.dto;

import com.danielalmeida.java_spring_mongodb.domain.User;

import java.io.Serial;
import java.io.Serializable;

public class UserDTO implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;
  private String id;
  private String name;
  private String email;

  public UserDTO(){}
  public UserDTO(User obj){
    this.id = obj.getId();
    this.name = obj.getName();
    this.email = obj.getEmail();
  }
  public void setId(String id){
    this.id = id;
  }
  public String getId(){
    return id;
  }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return email;
  }

}
