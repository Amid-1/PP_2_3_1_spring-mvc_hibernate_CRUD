package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    // При заходе на localhost:8080 — сразу редиректим на /users
    @GetMapping("/")
    public String redirectToUsers() {
        return "redirect:/users";
    }
}
