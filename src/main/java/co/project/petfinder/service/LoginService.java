package co.project.petfinder.service;

import java.util.List;

import co.project.petfinder.Controller.dto.UserResponse;

public interface LoginService {
   UserResponse validateUser(String email, String password);
 
}
