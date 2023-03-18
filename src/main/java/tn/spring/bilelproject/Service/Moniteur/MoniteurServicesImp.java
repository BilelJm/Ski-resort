package tn.spring.bilelproject.Service.Moniteur;

import tn.spring.bilelproject.Repository.ICoursRepository;
import tn.spring.bilelproject.entities.Cours;
import tn.spring.bilelproject.entities.Moniteur;
import tn.spring.bilelproject.entities.Support;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoniteurServicesImp implements IMoniteurServices {

    @Autowired
    tn.spring.bilelproject.Repository.IMoniteurRepository IMoniteurRepository;
    @Autowired
    ICoursRepository iCoursRepository;


    @Override
    public List<Moniteur> retrieveAllMoniteurs() {
        return IMoniteurRepository.findAll() ;
    }
    public Moniteur addMoniteur(Moniteur moniteur) { return IMoniteurRepository.save(moniteur);}

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return IMoniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur retrieveMoniteur(Long numMoniteur) {
        return IMoniteurRepository.findById(numMoniteur).get();
    }

    @Override
    public void removeMoniteur(Long numMoniteur) {
         IMoniteurRepository.deleteById(numMoniteur);
    }

    @Override
    public Integer GetWeeksNumber(@Param("moniteurnum")Long moniteurnum, @Param("support") Support support)
    {
        return IMoniteurRepository.GetWeeksNumber(moniteurnum,support);
    }

    @Override
    public Moniteur addMonitorAndAssignToCours(Moniteur moniteur, Long numCours) {
        Cours cours=iCoursRepository.findById(numCours).get();
        List<Cours> ls = new ArrayList<>();
        ls.add(cours);
        moniteur.setCours(ls);
        return IMoniteurRepository.save(moniteur);


    }


}
