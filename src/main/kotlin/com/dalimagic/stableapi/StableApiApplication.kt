package com.dalimagic.stableapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement


@SpringBootApplication
@EnableJpaRepositories("com.dalimagic.stableapi.repository.*")
class StableApiApplication

fun main(args: Array<String>) {
	runApplication<StableApiApplication>(*args)
}
