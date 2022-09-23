package co.project.petfinder.Controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PqrsDto {
  private String documentnumber;
  private String name;
  private String lastname;
  private String email;
  private String phonenumber;
  private String typeRequest;
  private String comment;
}
