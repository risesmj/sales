package com.risesmj.sales.domain.entities

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id : Int? = null,
    var name: String?
)
