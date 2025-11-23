package com.pixel0.Ex9.controller;

import com.pixel0.Ex9.dto.CreateOrderDTO;
import com.pixel0.Ex9.dto.OrderDTO;
import com.pixel0.Ex9.model.Order;
import com.pixel0.Ex9.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    public OrderService service;
    public OrderController(OrderService service){
        this.service = service;
    }
    @GetMapping
    public List<OrderDTO> getOrders(){
        return service.getALlOrders();
    }
    @PostMapping
    public OrderDTO saveOrder(@RequestBody CreateOrderDTO dto){
        return service.createOrder(dto);
    }
}
