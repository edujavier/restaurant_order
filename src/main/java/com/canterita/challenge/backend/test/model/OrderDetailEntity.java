package com.canterita.challenge.backend.test.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "ORDER_DETAIL_ENTITY")
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "detail")
    private String detail;

    @JoinColumn(nullable = false, name = "order_id")
    @ManyToOne(optional = false)
    private OrderEntity orderEntity;
}
