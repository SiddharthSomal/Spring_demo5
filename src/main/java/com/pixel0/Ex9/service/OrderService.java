package com.pixel0.Ex9.service;

import com.pixel0.Ex9.dao.OrderRepository;
import com.pixel0.Ex9.dao.UserRepository;
import com.pixel0.Ex9.dto.CreateOrderDTO;
import com.pixel0.Ex9.dto.OrderDTO;
import com.pixel0.Ex9.mapper.OrderMapper;
import com.pixel0.Ex9.model.Order;
import com.pixel0.Ex9.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    public OrderService(UserRepository userRepository,OrderRepository orderRepository){
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }

    public OrderDTO createOrder(CreateOrderDTO dto){
        User user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        Order order = new Order();
        order.setOrderName(dto.getOrderName());
        order.setUser(user);

        orderRepository.save(order);
        return OrderMapper.toDTO(order);
    }
    public List<OrderDTO> getALlOrders(){
        return orderRepository.findAll()
                .stream()
                .map(OrderMapper::toDTO)
                .collect(Collectors.toList());
    }
}
