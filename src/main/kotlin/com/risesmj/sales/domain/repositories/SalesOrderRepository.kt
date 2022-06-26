package com.risesmj.sales.domain.repositories

import com.risesmj.sales.domain.entities.SalesOrder
import org.springframework.data.jpa.repository.JpaRepository

interface SalesOrderRepository: JpaRepository<SalesOrder, Int>