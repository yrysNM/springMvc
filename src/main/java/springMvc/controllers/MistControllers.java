package springMvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mist")
public class MistControllers {

    @GetMapping("/heroes")
    public String getHeroes() {
        return "mist/heroes.html";
    }
}
