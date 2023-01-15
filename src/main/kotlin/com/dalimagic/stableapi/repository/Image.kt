package com.dalimagic.stableapi.repository

import java.time.LocalDateTime
import javax.persistence.*


@Entity
@Table(name = "image")
data class Image (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val image_url: String,
    val date_created: LocalDateTime,
    val user: String
)