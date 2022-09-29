package co.project.petfinder.service.impl;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.project.petfinder.Controller.dto.ReporterDto;
import co.project.petfinder.model.repository.ReporterRepository;
import co.project.petfinder.service.ReporterService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReporterServiceImpl implements ReporterService {

    private final ReporterRepository ReporterRepository;
    
@Override
//Creación super clase getReportes en ReporterService.java
    public List<ReporterDto> getReportes() {
        // ToDo cambiarlo a Pageable para seleccionar de a 9 animales reportados
        var reportes = ReporterRepository.findAll(Sort.by("name"));

        //Modificación de nombre de atributos Getter
        return reportes.stream()
            .map(rep -> new ReporterDto(rep.getId(), rep.getPetName(), rep.getGener(), rep.getPetOwner(), rep.getPhonenumber(),rep.getBreed(), rep.getEmail(), rep.getInstagram(), rep.getDateOfLost(), rep.getCity(),rep.getDescription(), rep.getImageUrl()))
            .collect(Collectors.toList());
}
//Cierre de llave faltante.
}

