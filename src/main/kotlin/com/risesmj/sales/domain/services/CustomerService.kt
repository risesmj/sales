package com.risesmj.sales.domain.services

import com.risesmj.sales.domain.entities.Customer
import com.risesmj.sales.domain.repositories.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomerService {

    @Autowired
    private lateinit var repository: CustomerRepository

    fun save(customer: Customer){
        repository.insert(customer)
    }

    private fun validateCustomer(customer: Customer){}


}