package com.pixel0.Ex9.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pixel0.Ex9.model.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
