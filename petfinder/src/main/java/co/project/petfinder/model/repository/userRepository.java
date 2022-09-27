package co.project.petfinder.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.project.petfinder.model.entity.User;

public interface userRepository extends JpaRepository<User, String> {
    
    // Optional<User> findByUsernameAndPasswordAndActiveIsTrue(String username, String password);

    // Optional<User> findByEmail(String email);

}
