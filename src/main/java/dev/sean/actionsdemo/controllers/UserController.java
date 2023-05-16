package dev.sean.actionsdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(){
        String response = "This is CREATE user endpoint...";
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get-users")
    public ResponseEntity<String> getUsers(){
        String response = "This is GET users endpoint...";
        return ResponseEntity.ok(response);
    }

    @PatchMapping("/update-user")
    public ResponseEntity<String> updateUser(){
        String response = "This is UPDATE user endpoint...";
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/delete-user")
    public ResponseEntity<String> deleteUser(){
        String response = "This is DELETE user endpoint...";
        return ResponseEntity.ok(response);
    }
}
