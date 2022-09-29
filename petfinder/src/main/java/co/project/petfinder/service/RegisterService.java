package co.project.petfinder.service;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import co.project.petfinder.Controller.dto.RegisterDto;


public interface RegisterService   {
 
   
  public User save(RegisterDto registerDto);


}
