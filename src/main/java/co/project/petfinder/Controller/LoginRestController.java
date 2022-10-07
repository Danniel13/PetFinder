package co.project.petfinder.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.project.petfinder.Controller.dto.LoginRequest;
import co.project.petfinder.service.LoginService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
// El restcontroller nos va a permitir spublicar metodos o rutas en el servi las cuales van a recibir un cuerpo y va a entregar datosno entrega html
// Servicios rest!!
@RestController 
// Request mapping para definir ruta que esta clase va a escuchar: localhost:8080/api/login
@RequestMapping("api/login")
public class LoginRestController {

  private final LoginService loginService;
  
  @PostMapping
  public ResponseEntity<?> login(@RequestBody LoginRequest user) {
      try {
          var response = loginService.validateUser(user.getEmail(), user.getPassword());
          return ResponseEntity.ok(response);
      } catch (RuntimeException ex) {
          return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                  .body(ex.getMessage());
      }
  }

  @PostMapping("/fake")
  public  ResponseEntity<?> fakeLogin() {
      return ResponseEntity.badRequest().build();
  }

}
 