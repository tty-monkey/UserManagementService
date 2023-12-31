package com.ttymonkey.springcoroutines.dto

data class IdNameTypeResponse(
    val id: Int,
    val name: String,
    val type: ResultType,
)

enum class ResultType {
    USER, COMPANY
}
