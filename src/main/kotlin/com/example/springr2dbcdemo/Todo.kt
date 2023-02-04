package com.example.springr2dbcdemo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table(name = "todo")
data class Todo(
    @Id
    val id: String? = null,
    @Column
    val description: String,
    @Column
    val completed: Boolean,
)
