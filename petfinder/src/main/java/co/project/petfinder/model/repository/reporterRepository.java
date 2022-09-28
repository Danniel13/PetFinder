package co.project.petfinder.model.repository;

// import java.util.List;
// import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.project.petfinder.model.entity.Reporter;

public interface reporterRepository extends JpaRepository<Reporter, Long> {

    // List<Reporter> findAllByReporterId(Long reporterId);

    // List<Reporter> findAllByDescriptionLikeOrderByNameAsc(String description);

    // Optional<Reporter> findByName(String string);
    
}
