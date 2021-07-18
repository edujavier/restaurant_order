package com.canterita.challenge.backend.test.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity(name = "ORDER_ENTITY")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "client")
	private String client;

	@Column(name = "total")
	private Double total;
	
	@Column(name = "date_order")
	private LocalDateTime dateOrder;

	@OneToMany(cascade= CascadeType.ALL, mappedBy = "orderEntity")
	private List<OrderDetailEntity> orderDetailEntityList;

}
