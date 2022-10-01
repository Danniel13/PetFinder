// package co.project.petfinder.Controller;


// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PostMapping;

// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RestController;

// import co.project.petfinder.Controller.dto.RegisterDto;
// import co.project.petfinder.service.RegisterService;
// import lombok.AllArgsConstructor;
// import lombok.extern.slf4j.Slf4j;






// @RestController
// @RequestMapping("/register")
// @Slf4j
// @AllArgsConstructor
// public class Registercontroller {

//   private RegisterService registerService;




//   @PostMapping("/register")
//   public String postRegister(@ModelAttribute RegisterDto registerinfo, Model model) {
//       log.info(registerinfo.toString());
      
//       registerService.save(registerinfo);

//       model.addAttribute("info", registerinfo);
//       return "redirect:/";
//   }

//   @GetMapping("/register")
//   public String getRegister(@ModelAttribute RegisterDto registerinfo, Model model) {
      
      
//       registerService.save(registerinfo);

//       model.addAttribute("info", registerinfo);
//       return "redirect:/";
//   }




// }
  // private RegisterService registerService;
  
  // public Registercontroller (RegisterService registerService) {
  //   super();
  //   this.registerService = registerService;
  // }





  // @ModelAttribute("/register")
  // public RegisterDto returnnewRegisterDto(){
  //   return new RegisterDto();
    
  // }
  // @GetMapping("/register")
  // public String register(Model model) { // Model es la forma como se va a enviar desde backend al html //VALIDAR MODEL
  //   return "register";
  // }

  
  // @PostMapping
  // public String registeruser(@ModelAttribute("register") RegisterDto registerDto){
  //   registerService.save(registerDto);
  //   return "redirect:/register";

  // }
    


