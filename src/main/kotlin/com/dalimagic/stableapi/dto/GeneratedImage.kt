package com.dalimagic.stableapi.dto

data class GeneratedImage(
    val data: List<String>,
    val is_generating: Boolean,
    val duration: Double,
    val average_duration: Double
)
