package com.risesmj.sales

import com.risesmj.sales.domain.entities.Customer
import com.risesmj.sales.domain.repositories.CustomerRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.util.Assert

@SpringBootTest
class SalesApplicationTests {

	@Autowired
	private lateinit var repository: CustomerRepository

	@Test
	fun insertCustomer(){
		var c = repository.save(Customer(name = "Teste"))
		Assert.isInstanceOf(Customer::class.java,c)
	}

	@Test
	fun contextLoads() {
	}

}
