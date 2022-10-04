package co.project.petfinder.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

// Backend a front
@Data
public class RegisterDto {
  private Integer id;
  private String name;
  private String lastname;
  private String password;
  private String email;
}
