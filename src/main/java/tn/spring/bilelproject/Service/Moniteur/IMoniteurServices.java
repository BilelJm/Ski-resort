package tn.spring.bilelproject.Service.Moniteur;

import tn.spring.bilelproject.entities.Moniteur;
import tn.spring.bilelproject.entities.Support;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMoniteurServices {
    List<Moniteur> retrieveAllMoniteurs();

    Moniteur addMoniteur(Moniteur moniteur);

    Moniteur updateMoniteur (Moniteur moniteur);

    Moniteur retrieveMoniteur (Long numMoniteur);
    void removeMoniteur (Long numMoniteur);
    Integer GetWeeksNumber(@Param("moniteurnum")Long moniteurnum,@Param("support") Support support);
    public Moniteur addMonitorAndAssignToCours(Moniteur moniteur, Long numCours);
}
