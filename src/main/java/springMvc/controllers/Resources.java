package springMvc.controllers;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import springMvc.entity.Heroes;

public class Resources {
  @GET
  @Path("listHeroes")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Heroes> getListHeroes() {
    Heroes hereos = new Heroes(1, "Kakashi", "Hokage");
    Heroes hereos2 = new Heroes(2, "Obito", "Hokage");
    Heroes hereos3 = new Heroes(3, "Minato", "Hokage");

    List<Heroes> list = new ArrayList<>();

    list.add(hereos);
    list.add(hereos2);
    list.add(hereos3);

    return list;

  }
}
