package co.project.petfinder.service.impl;

import org.springframework.stereotype.Service;

import co.project.petfinder.model.repository.LoginRepository;

import co.project.petfinder.service.LoginService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoginServiceimpl implements LoginService {
  
  private final LoginRepository loginRepository;

  @Override
  public void validateUser(String email, String password) {
    var userOp = loginRepository.findByemailAndPasswordAndActiveIsTrue(email, password);
    if (userOp.isEmpty()) {
        throw new RuntimeException("Credenciales inválidas");
    }
 

    
  }

  

}
