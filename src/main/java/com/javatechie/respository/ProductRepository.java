package com.javatechie.respository;

import com.javatechie.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends
        JpaRepository<Product, Integer> {


}
