package springMvc.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestJsonPlaceholderController {

  @GetMapping(value = "/todoUsers")
  public List<Object> getUsers() {
    String baseUrl = "https://jsonplaceholder.typicode.com/users";
    RestTemplate restTemplate = new RestTemplate();

    Object[] users = restTemplate.getForObject(baseUrl, Object[].class);

    return Arrays.asList(users);
  }
}
