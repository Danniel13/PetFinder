package co.project.petfinder.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// Backend a front
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {
  private Integer id;
  private String name;
  private String lastname;
  private String password;
  private String email;
}
