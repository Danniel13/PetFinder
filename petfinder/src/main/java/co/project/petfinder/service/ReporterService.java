package co.project.petfinder.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import co.project.petfinder.model.entity.Reporter;


public interface ReporterService {

  Page<Reporter> getAll(Pageable pageable);
  // public abstract List<Reporter> getReportes();

  public abstract Reporter addReporter(Reporter reporter);

}
