package com.risesmj.sales.domain.entities

import java.math.BigDecimal
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    var description: String? = null,
    var price: BigDecimal? = null
)
