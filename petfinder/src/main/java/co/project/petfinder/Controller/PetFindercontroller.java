package co.project.petfinder.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import co.project.petfinder.Controller.dto.RegisterDto;
import co.project.petfinder.service.RegisterService;
import lombok.AllArgsConstructor;


@Controller

public class PetFindercontroller {
  
  private RegisterService registerService;
  
  public PetFindercontroller(RegisterService registerService) {
    super();
    this.registerService = registerService;
  }

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


  @ModelAttribute("/register")
  public RegisterDto returnnewRegisterDto(){
    return new RegisterDto();
    
  }
  @GetMapping("/register")
  public String register(Model model) { // Model es la forma como se va a enviar desde backend al html //VALIDAR MODEL
    return "register";
  }


  @PostMapping
  public String registeruser(@ModelAttribute("Register") RegisterDto registerDto){
    registerService.save(registerDto);
    return "redirect:/register?exito";

  }
    
}
