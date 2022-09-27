package co.project.petfinder.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Backend y Base de datos!

@Entity
@Table(name = "reporter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporter {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "reporter_id")
  private Long id;
  

  private String petName;
  private String petOwner;
  private String phonenumber;
  private String breed;

  private String email;
  private String instagram;
  private String dateOfLost;
  private String city;
  private String description;
  private String imageUrl;  

  @ManyToOne
  private User user;
}
