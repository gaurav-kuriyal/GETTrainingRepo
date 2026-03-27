package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
