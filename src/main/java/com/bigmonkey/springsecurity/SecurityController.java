package com.bigmonkey.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("loginPage")
    public String loginPage() {
        return "loginPage";
    }
}
