package com.canterita.challenge.backend.test.repository;

import com.canterita.challenge.backend.test.model.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long> {

}
