package co.project.petfinder.Controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginResponseDto {
  private String email;

  private String name;


}
