package co.project.petfinder.service.impl;

import org.springframework.stereotype.Service;

import co.project.petfinder.Controller.dto.LoginResponseDto;
import co.project.petfinder.model.repository.LoginRepository;

import co.project.petfinder.service.LoginService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LoginServiceimpl implements LoginService {
  
  private final LoginRepository loginRepository;

  @Override
  public LoginResponseDto validateUser(String email, String password) {
    var userOp = loginRepository.findByemailAndPassword(email, password);
    if (userOp.isEmpty()) {
        throw new RuntimeException("Credenciales inválidas");
        
    }
    var user = userOp.get();
    return LoginResponseDto.builder()
            .email(user.getEmail())
            .name(user.getName())
            .build();

  }
  }

  


