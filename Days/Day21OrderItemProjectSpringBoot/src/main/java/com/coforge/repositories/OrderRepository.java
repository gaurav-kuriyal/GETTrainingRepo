package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
