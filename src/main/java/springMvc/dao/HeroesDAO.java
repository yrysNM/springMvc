package springMvc.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import springMvc.entity.Heroes;

@Component
public class HeroesDAO {
  private ArrayList<Heroes> heroes;
  private static int id;
  {
    heroes = new ArrayList<>();

    heroes.add(new Heroes(++id, "Naruto", "Hakage"));
    heroes.add(new Heroes(++id, "Kakashi", "Hakage"));
    heroes.add(new Heroes(++id, "Sakura", "Dzhonin"));
    heroes.add(new Heroes(++id, "Saske", "Dzhonin"));
  }

  public ArrayList<Heroes> getHeroes() {
    return heroes;
  }

  public void addHeroe(Heroes heroe) {
    heroe.setId(++id);
    heroes.add(heroe);
  }

  public Heroes show(int id) {

    // for (Heroes h : heroes) {
    // if (h.getId() == id) {
    // return h;
    // }
    // }
    // return null;

    return heroes.stream()
        .filter(h -> h.getId() == id).findAny().orElse(null);

  }

  public void addHero(Heroes hero) {
    hero.setId(++id);
    heroes.add(hero);
  }
}
