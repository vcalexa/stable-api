package com.dalimagic.stableapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class StableApiApplication

fun main(args: Array<String>) {
	runApplication<StableApiApplication>(*args)
}
