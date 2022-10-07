package co.project.petfinder.Controller.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserResponse {
  private String email;

  private String name;
  private String lastname;

}
