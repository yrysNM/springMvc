package springMvc.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import springMvc.entity.Heroes;

@Controller
@RequestMapping("/mist")
public class MistControllers {

    @GetMapping("/heroes")
    public String getHeroes(Model model) {
        model.addAttribute("info", "Hello mist village");
        model.addAttribute("heroes", Arrays.asList(
                new Heroes(1, "Gara", "kage"),
                new Heroes(2, "Minato", "hakage"),
                new Heroes(3, "Madara", "uchiha")));

        return "mist/heroes.html";
    }
}
