package com.risesmj.sales.domain.entities

import java.math.BigDecimal
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne


@Entity
data class ItemSalesOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @ManyToOne
    @JoinColumn(name = "sales_order_id")
    var salesOrder: SalesOrder? = null,

    @ManyToOne
    @JoinColumn(name = "product_id")
    var product: Product? = null,

    @Column(name = "price", length = 20, precision = 2)
    var price: BigDecimal? = null,

    var quantity: Int? = null
)