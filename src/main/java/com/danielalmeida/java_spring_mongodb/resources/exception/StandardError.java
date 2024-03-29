package com.danielalmeida.java_spring_mongodb.resources.exception;

import java.io.Serial;
import java.io.Serializable;

public class StandardError implements Serializable {
  @Serial
  private static final long serialVersionUID = 1L;
  private Long timestamp;
  private Integer status;
  private String error;
  private String message;
  private String path;

  public StandardError() {
  }

  public StandardError(Long timestamp, Integer status, String error, String message, String path) {
    this.timestamp = timestamp;
    this.status = status;
    this.error = error;
    this.message = message;
    this.path = path;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getStatus() {
    return status;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getPath() {
    return path;
  }

}
