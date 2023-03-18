package tn.spring.bilelproject.Service.Piste;

import tn.spring.bilelproject.Repository.IPisteRepository;
import tn.spring.bilelproject.Repository.ISkieurRepository;
import tn.spring.bilelproject.entities.Couleur;
import tn.spring.bilelproject.entities.Piste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteServicesImp implements IPisteServices {

    @Autowired
    IPisteRepository iPisteRepository;
    @Autowired
    ISkieurRepository iSkieurRepository;


    @Override
    public List<Piste> retrieveAllPistes() {
        return iPisteRepository.findAll();
    }

    @Override
    public Piste addPiste(Piste piste) {
        return iPisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return iPisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return iPisteRepository.findById(numPiste).get();
    }

    @Override
    public void removePiste(Long numPiste) {
        iPisteRepository.deleteById(numPiste);
    }





}
