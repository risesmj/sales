package com.risesmj.sales.domain.repositories

import com.risesmj.sales.domain.entities.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param


/*
Anotações Query method
findBy = retorna uma lista
findOneBy = retorna um único objeto

Com anotação de query, basta escrever a query desejada
e anotar Param os parâmetros que serão realizados o bind
no sql

nativeQuery indica que é sql nativo, e não do h2 em memória
 */
interface CustomerRepository: JpaRepository<Customer, Int>{
    @Query("SELECT c customer c WHERE c.name LIKE '%:name%", nativeQuery = true)
    fun findByNameWithQuery(
        @Param("name") name: String
    ): List<Customer>
    fun findByNameLike(name: String): List<Customer>
    fun findByNameOrId(name: String, id: Int): List<Customer>
    fun findOneByName(name: String): Customer
    fun existsByName(name: String): Boolean
    @Modifying
    fun deleteByName(name: String)

    @Query(" SELECT c FROM customer c LEFT JOIN fetch c.salesOrder WHERE  c.id = id")
    fun findCustomerFetchSalesOrderWithQuery(@Param("id") id: Int): Customer
}

/*
@Repository
class CustomerRepository{

    @Autowired
    private lateinit var entityManager: EntityManager

    @Transactional
    fun insert(c: Customer){
        entityManager.persist(c)
    }

    @Transactional
    fun findAll(): List<Customer>{
        return entityManager.createQuery("from customer", Customer::class.java).resultList
    }

    @Transactional
    fun update(c: Customer){
        entityManager.merge(c)
    }

    @Transactional
    fun delete(id: Int){
        val c: Customer = entityManager.find(Customer::class.java, id)
        entityManager.remove(c)
    }

}
 */