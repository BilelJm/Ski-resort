package tn.spring.bilelproject.Service.Cours;

import tn.spring.bilelproject.Repository.ICoursRepository;
import tn.spring.bilelproject.entities.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursServicesImp implements ICoursServices {
    @Autowired
    ICoursRepository ICoursRepository;


    @Override
    public List<Cours> retrieveAllCourses() {
        return ICoursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return ICoursRepository.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return ICoursRepository.save(cours);
    }

    @Override
    public Cours retrieveCours(Long numCours) {
        return ICoursRepository.findById(numCours).get();
    }

    @Override
    public void removeCours(Long numCours) {
        ICoursRepository.deleteById(numCours);
    }
}
