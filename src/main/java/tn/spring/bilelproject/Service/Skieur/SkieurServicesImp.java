package tn.spring.bilelproject.Service.Skieur;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.spring.bilelproject.Repository.*;
import tn.spring.bilelproject.entities.*;

import java.util.List;

@Service
public class SkieurServicesImp implements ISkieurServices {

    @Autowired
    ISkieurRepository iSkieurRepository;
    @Autowired
    ICoursRepository iCoursRepository;
    @Autowired
    IInscriptionRepository iInscriptionRepository;
    @Autowired
    IAbonnementRepository iAbonnementRepository;
    @Autowired
    IPisteRepository iPisteRepository;


    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return iSkieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return iSkieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
        iSkieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return iSkieurRepository.findById(numSkieur).get();
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return iSkieurRepository.save(skieur);
    }

    @Override
    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = iSkieurRepository.findById(numSkieur).get();
        Piste piste = iPisteRepository.findById(numPiste).get();
        skieur.getPistes().add(piste);
        return iSkieurRepository.save(skieur);

    }
    @Override
    public Skieur addSkieurAndAssignToCourse(Skieur skieur, Long numCours) {
        Cours c = iCoursRepository.findById(numCours).orElse(null);
        List<Inscription> ls =skieur.getInscriptions();
        for (Inscription inscription:ls)
        {
            inscription.setCours(c);
            inscription.setSkieur(skieur);
            iInscriptionRepository.save(inscription);
        }
        return iSkieurRepository.save(skieur);
    }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
      return iSkieurRepository.retrieveSkiersBySubscriptionType(typeAbonnement);
    }



}
