package pl.project.Faktury2019.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("/rejestracja")
    public String login(){
        return "rejestracja";
    }
}
