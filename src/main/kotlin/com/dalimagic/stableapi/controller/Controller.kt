package com.dalimagic.stableapi.controller

import com.dalimagic.stableapi.service.CompleteDto
import com.dalimagic.stableapi.service.StableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class Controller {
    @Autowired
    lateinit var stableService: StableService

    @PostMapping("/predict")
    fun predict(@RequestBody completeDto: CompleteDto): Mono<String> {
        return stableService.getImage(completeDto)
    }
}