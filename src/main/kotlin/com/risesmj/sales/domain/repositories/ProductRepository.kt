package com.risesmj.sales.domain.repositories

import com.risesmj.sales.domain.entities.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, Int>