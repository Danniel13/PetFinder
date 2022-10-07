package co.project.petfinder.model.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.project.petfinder.model.entity.Register;

public interface LoginRepository extends JpaRepository<Register, String>{
  

  Optional<Register> findByEmailAndPassword(String email, String password);
  

}
