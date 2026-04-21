package br.com.desafio_todolist.service;

import br.com.desafio_todolist.entity.Todo;
import br.com.desafio_todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List <Todo> create(Todo todo){
        todoRepository.save(todo);
    }
}
