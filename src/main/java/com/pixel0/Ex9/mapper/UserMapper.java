package com.pixel0.Ex9.mapper;

import com.pixel0.Ex9.dto.UserDTO;
import com.pixel0.Ex9.model.User;

import java.util.stream.Collectors;

public class UserMapper {
    public static UserDTO toDTO(User user){
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setOrderIds(
                user.getOrdersList()
                        .stream()
                        .map(order -> order.getUserId())
                        .collect(Collectors.toList())
        );
        return dto;
    }
}
