package co.project.petfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class PetFindercontroller {
  

  @GetMapping("/SignIn")
  public String SignIn(Model model) { // Model es la forma como se va a enviar desde backend al html
    return "SignIn";
  }




}
