package co.project.petfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.project.petfinder.Controller.dto.RegisterDto;
import co.project.petfinder.service.RegisterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
@AllArgsConstructor
public class PetFindercontroller {
  

  private RegisterService registerService;

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

  // @GetMapping("/register")
  // public String register(Model model) { // Model es la forma como se va a enviar desde backend al html
  //   return "register";
  // }


  @PostMapping("/register")
  public String postRegister(@ModelAttribute RegisterDto registerinfo, Model model) {
      log.info(registerinfo.toString());
      
      registerService.save(registerinfo);

      model.addAttribute("info", registerinfo);
      return "redirect:/";
  }

  @GetMapping("/register")
  public String getRegister(@ModelAttribute RegisterDto registerinfo, Model model) {
      
      
      registerService.save(registerinfo);

      model.addAttribute("info", registerinfo);
      return "register";


  }

}