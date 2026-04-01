package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemopsApplication {

public static void main(String[] args) {
SpringApplication.run(DemopsApplication.class, args);
}

@PostMapping("/login")
public String validateLogin(@RequestParam String username,
                           @RequestParam String password) {

if ("admin".equals(username) && "1234".equals(password)) {
return "Login Successful";
} else {
return "Invalid Username or Password";
}
}
}