package com.risesmj.sales

import com.risesmj.sales.annotations.Cat
import com.risesmj.sales.configurations.Animal
import com.sun.tools.javac.tree.TreeInfo.args
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.CommandLineRunner
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

    @Cat
    private lateinit var animal: Animal

    @Value("\${application.name}")
    private lateinit var applicationName: String

    @GetMapping("/hello")
    fun helloWord(): String{
        return applicationName
    }
}