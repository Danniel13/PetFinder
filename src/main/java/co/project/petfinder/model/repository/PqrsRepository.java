package co.project.petfinder.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.project.petfinder.model.entity.Pqrs;

@Repository("pqrsrepository")
public interface PqrsRepository  extends JpaRepository <Pqrs, Long>{
    
}