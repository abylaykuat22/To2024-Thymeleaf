package bitlab.to2024.g1.thymeleafapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String homePage() {
    return "home";
  }

  @GetMapping("/demo")
  public String demoPage() {
    return "demo";
  }
}
