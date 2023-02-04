package com.example.springr2dbcdemo

import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository : CoroutineCrudRepository<Todo, String>
