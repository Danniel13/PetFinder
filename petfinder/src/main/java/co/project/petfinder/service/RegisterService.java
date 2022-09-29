package co.project.petfinder.service;



import co.project.petfinder.Controller.dto.RegisterDto;
import co.project.petfinder.model.entity.Register;


public interface RegisterService   {
 
   
  public Register save(RegisterDto registerDto);


}
