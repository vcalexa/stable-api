package com.dalimagic.stableapi.service

import com.dalimagic.stableapi.client.StableClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class StableService {
    @Autowired
    lateinit var stableClient: StableClient

    fun getImage(completeDto: CompleteDto): Mono<String> {
        return stableClient.getData(completeDto)
    }
}