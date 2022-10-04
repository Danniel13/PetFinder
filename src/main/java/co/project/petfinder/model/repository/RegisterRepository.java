package co.project.petfinder.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.project.petfinder.model.entity.Register;



public interface RegisterRepository extends JpaRepository<Register, Integer> {

}
