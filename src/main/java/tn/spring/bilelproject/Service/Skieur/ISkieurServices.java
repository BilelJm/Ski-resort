package tn.spring.bilelproject.Service.Skieur;

import tn.spring.bilelproject.entities.Skieur;
import tn.spring.bilelproject.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurServices {
    List<Skieur> retrieveAllSkieurs();

    Skieur addSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);

    Skieur retrieveSkieur (Long numSkieur);
    Skieur updateSkieur (Skieur skieur);
    Skieur addSkieurAndAssignToCourse(Skieur skieur, Long numCourse);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
    public Skieur assignSkieurToPiste(Long numSkieur,Long numPiste);
}
