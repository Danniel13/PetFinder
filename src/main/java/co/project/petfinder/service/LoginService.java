package co.project.petfinder.service;

import co.project.petfinder.Controller.dto.LoginResponseDto;

public interface LoginService {
   LoginResponseDto validateUser(String email, String password);

}
