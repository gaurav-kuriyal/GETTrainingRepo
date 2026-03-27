package com.coforge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
