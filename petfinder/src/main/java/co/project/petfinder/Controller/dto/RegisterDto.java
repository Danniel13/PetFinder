package co.project.petfinder.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
  private String name;
  private String lastname;
  private String password;
  private String email;
}
