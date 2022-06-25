package com.risesmj.sales.domain.entities

import java.math.BigDecimal
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class ItemSalesOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    var salesOrder: SalesOrder? = null,
    var product: Product? = null,
    var price: BigDecimal? = null,
    var quantity: Int? = null
)