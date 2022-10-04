package co.project.petfinder.service;
import java.util.List;

import co.project.petfinder.model.entity.Pqrs;


public interface PqrsService {

  public abstract List<Pqrs> getPqrs();

  public abstract Pqrs addPqrs(Pqrs pqrs);

}
