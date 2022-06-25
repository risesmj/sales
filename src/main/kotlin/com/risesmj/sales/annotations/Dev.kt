package com.risesmj.sales.annotations

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@Configuration
@Profile("dev")
annotation class Dev()
