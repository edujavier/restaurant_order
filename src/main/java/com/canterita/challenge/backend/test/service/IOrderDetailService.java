package com.canterita.challenge.backend.test.service;

import com.canterita.challenge.backend.test.exception.OrderNotFoundException;

public interface IOrderDetailService {

    public Long saveOrderDetail(Long orderId, String orderDetail) throws OrderNotFoundException;


}
