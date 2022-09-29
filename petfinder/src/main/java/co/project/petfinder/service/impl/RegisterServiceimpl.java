package co.project.petfinder.service.impl;

import org.springframework.stereotype.Service;

import co.project.petfinder.Controller.dto.RegisterDto;
import co.project.petfinder.model.entity.Register;
import co.project.petfinder.model.repository.RegisterRepository;
import co.project.petfinder.service.RegisterService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegisterServiceimpl implements RegisterService {


    private RegisterRepository registerRepository;
    
  //Method
  @Override
  public Register save(RegisterDto registerDto){

    //Validar metodo por campos Id y Reporters.

    Register register = new Register(null, registerDto.getName(), registerDto.getLastname(), registerDto.getEmail(),
        registerDto.getPassword(), null);
        return registerRepository.save(register);

  }
  

}
