package com.pixel0.Ex9.controller;

import com.pixel0.Ex9.dto.CreateUserDTO;
import com.pixel0.Ex9.dto.UserDTO;
import com.pixel0.Ex9.model.User;
import com.pixel0.Ex9.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    public UserService service;
    public UserController(UserService service){
        this.service = service;
    }
    @GetMapping
    public List<UserDTO> getUsers(){
        return service.getAllUsers();
    }

    @PostMapping
    public UserDTO createUser(@RequestBody CreateUserDTO dto){
        return service.createUser(dto);
    }
}
