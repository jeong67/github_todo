package com.codestates.github_todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @GetMapping("/")
    public String toDoApplication() {
        return "To-do Application!"; // 화면 출력
    }
}
