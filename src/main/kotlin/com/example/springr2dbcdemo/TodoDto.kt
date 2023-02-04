package com.example.springr2dbcdemo

data class TodoDto(
    val id: String? = null,
    val description: String,
    val completed: Boolean,
)
