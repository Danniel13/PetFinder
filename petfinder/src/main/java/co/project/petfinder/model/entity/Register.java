package co.project.petfinder.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Backend y Base de datos!
@Entity
@Table(name = "Register")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {
  
  @Id
  @Column(name = "user_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String name;
  private String lastname;
  private String password;
  
  @Column (unique = true)
  private String email; 


  @OneToMany(mappedBy = "register")
  private List<Reporter> reporters;



}
