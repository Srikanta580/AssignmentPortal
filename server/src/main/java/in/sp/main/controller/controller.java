package in.sp.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }
}
