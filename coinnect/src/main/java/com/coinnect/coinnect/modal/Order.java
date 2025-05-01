package com.coinnect.coinnect.modal;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User user;
    private OrderType orderType;