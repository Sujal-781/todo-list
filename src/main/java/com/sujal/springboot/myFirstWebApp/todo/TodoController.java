package com.sujal.springboot.myFirstWebApp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private todoService todoService;

    public TodoController(todoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("todo-list")
    public String getTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("sujal");
        model.addAttribute("todos",todos);
        return "todos";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showMeNewTodoPage(Model model) {
        String username = (String) model.getAttribute("name");
        Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
        model.addAttribute("todo", todo); // clearer than model.put
        return "add-todo";
    }


    @RequestMapping(value="add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if(result.hasErrors()){
            return "add-todo";
        }
        String username = model.get("name").toString();
        todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusDays(10), false);
        return "redirect:todo-list";
    }

    @RequestMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:todo-list";
    }
}
