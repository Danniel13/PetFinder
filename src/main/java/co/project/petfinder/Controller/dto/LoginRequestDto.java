package co.project.petfinder.Controller.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
  private String email;
  private String password;
}
