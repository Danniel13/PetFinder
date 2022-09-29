package co.project.petfinder.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.project.petfinder.Controller.dto.RegisterDto;
import co.project.petfinder.service.RegisterService;



@RequestMapping
public class Registercontroller {
  private RegisterService registerService;
  
  public Registercontroller (RegisterService registerService) {
    super();
    this.registerService = registerService;
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
  public String registeruser(@ModelAttribute("register") RegisterDto registerDto){
    registerService.save(registerDto);
    return "redirect:/register?exito";

  }
    

}
