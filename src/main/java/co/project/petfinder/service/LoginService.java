package co.project.petfinder.service;


import co.project.petfinder.Controller.dto.UserResponse;

public interface LoginService {
   UserResponse validateUser(String email, String password);
 
}
