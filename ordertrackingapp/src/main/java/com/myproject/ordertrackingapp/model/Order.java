package com.myproject.ordertrackingapp.model;

import jakarta.persistence.*;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerName;

    @Enumerated(EnumType.STRING)
    private OrderStatus status; /// new picked packed , delivered

    private Customer customer;


    // private Address


}
