package com.risesmj.sales.domain.repositories

import com.risesmj.sales.domain.entities.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<Customer, Int>