package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.exception.OrderNotFoundException;
import com.canterita.challenge.backend.test.model.OrderDetailEntity;
import com.canterita.challenge.backend.test.model.OrderEntity;
import com.canterita.challenge.backend.test.repository.OrderDetailRepository;
import com.canterita.challenge.backend.test.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService implements IOrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;


    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Long saveOrderDetail(Long orderId, String orderDetail) throws OrderNotFoundException {

        OrderEntity orderEntity = orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order not found: "+orderId));
        OrderDetailEntity orderDetailEntityToSave = new OrderDetailEntity();
        orderDetailEntityToSave.setOrderEntity(orderEntity);
        orderDetailEntityToSave.setDetail(orderDetail);
        OrderDetailEntity orderDetailEntity = orderDetailRepository.save(orderDetailEntityToSave);
        return orderDetailEntity.getId();
    }
}
