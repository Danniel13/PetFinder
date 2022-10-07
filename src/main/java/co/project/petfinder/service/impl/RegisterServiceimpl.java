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
  public void save(RegisterDto register){

    //Validar metodo por campos Id y Reporters.
// REPORTER !! 
  //   Register register = new Register(null, registerDto.getName(), registerDto.getLastname(), registerDto.getEmail(),
  //       registerDto.getPassword(), null);
  //       return registerRepository.save(register);

  // }
  

  // FALTA PONER ID SE DEJA SIN ID POR SER AUTO
  Register entity = new Register();
  entity.setName(register.getName());
  entity.setEmail(register.getEmail());
  entity.setLastname(register.getLastname());
  entity.setPassword(register.getPassword());

  registerRepository.save(entity);




}
}