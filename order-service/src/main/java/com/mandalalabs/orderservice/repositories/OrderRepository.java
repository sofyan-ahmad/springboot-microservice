package com.mandalalabs.orderservice.repositories;

import com.mandalalabs.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
