package springMvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;

// import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;

import springMvc.dao.HeroesDAO;
import springMvc.entity.Heroes;

@Controller
@RequestMapping("/mist")
public class MistControllers {

    @Autowired
    private HeroesDAO heroesDAO;

    @GetMapping("/heroes")
    // @RequestParam("name") String name, @RequestParam("rang") String rang,
    public String getHeroes(Model model) {
        model.addAttribute("heroes", heroesDAO.getHeroes());

        // first variant HttpServletRequest request
        // String name = request.getParameter("name");
        // String rang = request.getParameter("rang");
        // System.out.println(name + " " + rang);

        model.addAttribute("info", "Hello mist village");
        // model.addAttribute("heroes", Arrays.asList(
        // new Heroes(1, "Gara", "kage"),
        // new Heroes(2, "Minato", "hakage"),
        // new Heroes(3, "Madara", "uchiha")));

        return "mist/heroes.html";
    }

    @GetMapping("/{id}")
    public String showHero(@PathVariable("id") int id, Model model) {
        model.addAttribute("oneHero", heroesDAO.show(id));
        return "mist/show.html";
    }

    @GetMapping("/newHero")
    public String newHero(Model model) {
        model.addAttribute("hero", new Heroes());

        return "mist/newHero.html";

    }

    @PostMapping("")
    public String addHero(@ModelAttribute("hero") Heroes hereos) {
        heroesDAO.addHero(hereos);

        return "redirect/mist";
    }
}
