package com.pixel0.Ex9.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderName;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(
            name = "user_id",
            foreignKey = @ForeignKey(name = "fk_orders_users")
    )
    private User user;

    public Long getUserId(){
        return user != null?user.getId():null;
    }
}
