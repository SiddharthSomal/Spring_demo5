package com.pixel0.Ex9.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private List<Long> orderIds;
}
