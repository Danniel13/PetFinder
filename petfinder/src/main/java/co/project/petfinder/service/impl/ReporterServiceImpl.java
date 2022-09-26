package co.project.petfinder.service.impl;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import co.project.petfinder.Controller.dto.ReporterDto;
import co.project.petfinder.model.repository.reporterRepository;
import co.project.petfinder.service.ReporterService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ReporterServiceImpl implements ReporterService {

    private final reporterRepository reporterRepository;
    
@Override
    public List<ReporterDto> getReportes() {
        var reportes = reporterRepository.findAll(Sort.by("name"));

        return reportes.stream()
                .map(rep -> new ReporterDto(rep.getName(),  rep.getId(), rep.petName(), rep.petOwner(), rep.phoneNumber(), rep.breed(), rep.email(), rem.instagram(), rep.dateOfLost(), rep.city(), rep.description(), rep.imageUrl()))
                .collect(Collectors.toList());
}

