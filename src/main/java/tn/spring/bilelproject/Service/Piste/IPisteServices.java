package tn.spring.bilelproject.Service.Piste;

import tn.spring.bilelproject.entities.Couleur;
import tn.spring.bilelproject.entities.Piste;

import java.util.List;

public interface IPisteServices {

    List<Piste> retrieveAllPistes();

    Piste addPiste(Piste piste);

    Piste updatePiste (Piste piste);

    Piste retrievePiste (Long numPiste);
    void removePiste(Long numPiste);






}
