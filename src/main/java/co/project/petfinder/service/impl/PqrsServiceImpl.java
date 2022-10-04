package co.project.petfinder.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import co.project.petfinder.model.entity.Pqrs;

import co.project.petfinder.model.repository.PqrsRepository;
import co.project.petfinder.service.PqrsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("pqrsservice")
public class PqrsServiceImpl implements PqrsService {
    
    @Autowired
    @Qualifier("pqrsrepository")
    private PqrsRepository pqrsRepository;

    @Override
    public List<Pqrs> getPqrs() {
        return pqrsRepository.findAll();
    }

    @Override
    public Pqrs addPqrs(Pqrs pqrs) {
        return pqrsRepository.save(pqrs);
    }

}