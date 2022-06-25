package com.risesmj.sales.annotations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Autowired
@Qualifier("dog")
annotation class Dog()
