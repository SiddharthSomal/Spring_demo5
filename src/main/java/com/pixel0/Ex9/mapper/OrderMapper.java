package com.pixel0.Ex9.mapper;

import com.pixel0.Ex9.dto.OrderDTO;
import com.pixel0.Ex9.model.Order;

public class OrderMapper {
    public static OrderDTO toDTO(Order order){
        OrderDTO dto = new OrderDTO();
        dto.setId(order.getId());
        dto.setOrderName(order.getOrderName());
        dto.setUserId(order.getUser().getId());
        return dto;
    }
}
