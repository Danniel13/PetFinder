package co.project.petfinder.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import co.project.petfinder.model.entity.Register;



public interface RegisterRepository extends JpaRepository<Register, Integer> {
  


}
