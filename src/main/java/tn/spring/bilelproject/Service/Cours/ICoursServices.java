package tn.spring.bilelproject.Service.Cours;

import tn.spring.bilelproject.entities.Cours;

import java.util.List;

public interface ICoursServices {
    List<Cours> retrieveAllCourses();

    Cours addCours(Cours cours);

    Cours updateCours (Cours cours);

    Cours retrieveCours (Long numCours);
    void removeCours(Long numCours);
}
