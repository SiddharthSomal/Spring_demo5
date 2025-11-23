package com.pixel0.Ex9.service;

import com.pixel0.Ex9.dao.UserRepository;
import com.pixel0.Ex9.dto.CreateUserDTO;
import com.pixel0.Ex9.dto.UserDTO;
import com.pixel0.Ex9.mapper.UserMapper;
import com.pixel0.Ex9.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository repo;
    public UserService(UserRepository repo){
        this.repo = repo;
    }
    public UserDTO createUser(CreateUserDTO dto){
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        repo.save(user);
        return UserMapper.toDTO(user);
    }
    public List<UserDTO> getAllUsers(){
        return repo.findAll()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }
    public User getById(Long id){
        return repo.findById(id).orElseThrow();
    }

}
