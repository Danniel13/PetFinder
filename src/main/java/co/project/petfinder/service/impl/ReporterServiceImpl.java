package co.project.petfinder.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import co.project.petfinder.model.entity.Reporter;
import co.project.petfinder.model.repository.ReporterRepository;
import co.project.petfinder.service.ReporterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Slf4j
@Service("reporterservice")
public class ReporterServiceImpl implements ReporterService {
    
    @Autowired
    @Qualifier("reporterrepository")
    private ReporterRepository reporterRepository;

    @Override
    public Page<Reporter> getAll(Pageable pageable) {
        
        return reporterRepository.findAll(pageable);
    }

    @Override
    public Reporter addReporter(Reporter reporter) {
        log.info(reporter.toString());
        return reporterRepository.save(reporter);
    }
}

