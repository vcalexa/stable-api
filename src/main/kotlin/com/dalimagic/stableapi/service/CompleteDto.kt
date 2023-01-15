package com.dalimagic.stableapi.service

data class CompleteDto(
    val fn_index: Int,
    val session_hash: String, val data: List<Any>
) {}