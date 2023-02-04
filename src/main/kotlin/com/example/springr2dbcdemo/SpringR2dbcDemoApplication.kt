package com.example.springr2dbcdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories
class SpringR2dbcDemoApplication

fun main(args: Array<String>) {
    runApplication<SpringR2dbcDemoApplication>(*args)
}
