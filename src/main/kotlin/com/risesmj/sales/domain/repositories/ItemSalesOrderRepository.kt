package com.risesmj.sales.domain.repositories

import com.risesmj.sales.domain.entities.ItemSalesOrder
import org.springframework.data.jpa.repository.JpaRepository

interface ItemSalesOrderRepository: JpaRepository<ItemSalesOrder, Int>