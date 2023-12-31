package com.kirti.todo.todoapp.service;

import com.kirti.todo.todoapp.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {

    Todo addTodoNote(Todo note);

    Boolean updateTodoNote(Todo note);

    Boolean deleteTodoNote(Long id);

    List<Todo> getAllTodoNote();

    Optional<Todo> getTodoNote(Long id);


}
