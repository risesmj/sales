package com.risesmj.sales.domain.entities

import java.math.BigDecimal
import java.time.LocalDate
import javax.persistence.*

@Entity
data class SalesOrder(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int? = null,

    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: Customer? = null,

    var emission: LocalDate? = null,

    @Column(name = "total", length = 20, precision = 2)
    var total: BigDecimal? = null,

    @OneToMany(mappedBy = "salesOrder")
    var items: List<ItemSalesOrder>? = null,

)
