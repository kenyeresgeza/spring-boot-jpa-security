package com.example.jpa.security;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h2>Welcome</h2>";
    }

    @GetMapping("/user")
    public String userhome() {
        return "<h2>Welcome User</h2>";
    }

    @GetMapping("/admin")
    public String adminhome() {
        return "<h2>Welcome Admin</h2>";
    }

}
