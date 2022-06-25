package com.risesmj.sales.domain.entities

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class SalesOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    var customer: Customer? = null,
    var emission: LocalDate? = null,
    var total: BigDecimal? = null
)
