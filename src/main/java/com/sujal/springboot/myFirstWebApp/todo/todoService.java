package com.sujal.springboot.myFirstWebApp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class todoService {

    private static List<Todo> todoList = new ArrayList<>();

    static int todoCounter = 0;

    static {
        todoList.add(new Todo(++todoCounter,"Striver","Practice DSA", LocalDate.now().plusDays(20), false));
        todoList.add(new Todo(++todoCounter,"in28Minutes","Learn Spring", LocalDate.now().plusDays(30), false));
        todoList.add(new Todo(++todoCounter,"Imran Teli","Learn DevOps", LocalDate.now().plusDays(80), false));
        todoList.add(new Todo(++todoCounter,"Github","Build Projects", LocalDate.now().plusDays(20), false));
    }

    public List<Todo> findByUsername(String username) {
        return todoList;
    }

    public void addTodo(String username, String description, LocalDate date, boolean done) {
        Todo todo = new Todo(++todoCounter, username, description, date, done);
        todoList.add(todo);
    }

    public void deleteById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todoList.removeIf(predicate);
    }
    public Todo findById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todoList.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(@Valid Todo todo){
        deleteById(todo.getId());
        todoList.add(todo);
    }
}
