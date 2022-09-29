package co.project.petfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class PetFindercontroller {
  


  @GetMapping("/signin")
  public String signin(Model model) { // Model es la forma como se va a enviar desde backend al html
    return "signin";
  }

  @GetMapping("/reporter") 
  public String reporter(Model model) { // Model es la forma como se va a enviar desde backend al html
    return "reporter";
  }


    @GetMapping("/pqrs")
  public String pqrs(Model model) { // Model es la forma como se va a enviar desde backend al html
    return "pqrs";
  }

  @GetMapping("/about_us")
  public String about_us(Model model) { // Model es la forma como se va a enviar desde backend al html
    return "about_us";
  }

  @GetMapping("/register")
  public String register(Model model) { // Model es la forma como se va a enviar desde backend al html
    return "register";
  }

}