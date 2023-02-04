package com.example.springr2dbcdemo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/todo")
class TodoController(
    private val todoRepository: TodoRepository
) {
    @GetMapping
    suspend fun getAll(): Flow<TodoDto> {
        return todoRepository.findAll().map {
            TodoDto(
                id = it.id,
                description = it.description,
                completed = it.completed,
            )
        }
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    suspend fun create(@RequestBody newTodoDtoBody: TodoDto) {
        val newTodoToBePersisted = Todo(
            description = newTodoDtoBody.description,
            completed = newTodoDtoBody.completed,
        )
        todoRepository.save(newTodoToBePersisted)
    }
}
