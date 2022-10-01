package co.project.petfinder.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Backend y Base de datos!
@Entity
@Table(name = "Pqrs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pqrs {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column(name = "pqrs_id")


  private String documentnumber;
  private String name;
  private String lastname;

  @Column (unique = true)
  private String email;
  private String phonenumber;
  private String typeRequest;
  private String comment;


}
