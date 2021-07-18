package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.dto.OrderDto;

public interface IOrderService {
	
	public OrderDto getOrder(Long id);
}
