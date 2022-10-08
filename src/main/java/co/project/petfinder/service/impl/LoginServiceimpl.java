package co.project.petfinder.service.impl;

import org.springframework.stereotype.Service;

import co.project.petfinder.Controller.dto.UserResponse;
import co.project.petfinder.model.repository.LoginRepository;

import co.project.petfinder.service.LoginService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoginServiceimpl implements LoginService {
  
  private final LoginRepository loginRepository;

  @Override
  public UserResponse validateUser(String email, String password) {
    var userOp = loginRepository.findByEmailAndPassword(email, password);
    if (userOp.isEmpty()) {
        throw new RuntimeException("Credenciales inválidas");
        
    }

    var user = userOp.get();

    return UserResponse.builder()
            .email(user.getEmail())
            .name(user.getName())
            .lastname(user.getLastname())
            .build();

  }





  }

  


