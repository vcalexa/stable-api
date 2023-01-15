package com.dalimagic.stableapi.client

import com.dalimagic.stableapi.service.CompleteDto
import org.springframework.cache.annotation.CacheConfig
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class StableClient {
    val webClient = WebClient.create("http://localhost:7860")
    fun getData(completeDto: CompleteDto): Mono<String> {
        return webClient.post()
            .uri("/run//predict")
            .body(BodyInserters.fromValue(completeDto))
            .retrieve()
            .bodyToMono(String::class.java)
    }
}