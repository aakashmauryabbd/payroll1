package com.example.demo;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
         super("Employee Not found " + id);
    }
}
