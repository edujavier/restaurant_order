package com.canterita.challenge.backend.test.rest;

import com.canterita.challenge.backend.test.dto.OrderDetailDto;
import com.canterita.challenge.backend.test.exception.OrderNotFoundException;
import com.canterita.challenge.backend.test.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.canterita.challenge.backend.test.dto.OrderDto;
import com.canterita.challenge.backend.test.service.IOrderService;
import org.springframework.web.server.ResponseStatusException;


@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IOrderDetailService orderDetailService;

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public OrderDto getOrder(@PathVariable Long id) {
        return orderService.getOrder(id);
    }

    @PostMapping(value = "/{id}/details")
    @ResponseStatus(HttpStatus.OK)
    public Long saveOrderDetail(@PathVariable Long id, @RequestBody OrderDetailRequest orderDetailRequest) {
        try {
            return orderDetailService.saveOrderDetail(id, orderDetailRequest.getOrderDetail());
        } catch (OrderNotFoundException exception) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, exception.getMessage());

        }
    }
}
