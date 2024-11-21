package com.layout.thymeleaf.layout_thymeleaf.controller;

import com.layout.thymeleaf.layout_thymeleaf.model.Task;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TaskController {

    @GetMapping("/create")
    public String home()
    {
        return "create";
    }

    @PostMapping("/create")
    public void create(Task task) {
        System.out.println("O nome da tarefa é: " + task.getName());
    }
}
