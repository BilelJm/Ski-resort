package tn.spring.bilelproject.Service.Abonnement;

import tn.spring.bilelproject.entities.Abonnement;
import tn.spring.bilelproject.entities.TypeAbonnement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AbonnementServicesImp implements IAbonnementServices {

    @Autowired
    tn.spring.bilelproject.Repository.IAbonnementRepository IAbonnementRepository;


    @Override
    public List<Abonnement> retrieveAllAbonnements() {
        return IAbonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return IAbonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return IAbonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement retrieveAbonnement(Long numAbonnement) {
        return IAbonnementRepository.findById(numAbonnement).get();
    }

    @Override
    public void removeAbonnement(Long numAbonnement) {
        IAbonnementRepository.deleteById(numAbonnement);

    }

    @Override
    public List<Abonnement> getAbonnementByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement) {
        return  IAbonnementRepository.getAbonnementByTypeAbonnementOrderByDateDebut(typeAbonnement);
    }

    @Override
    public List<Abonnement> getAbonnementByDateDebut(Date datedeb, Date datefin) {
        return IAbonnementRepository.getAbonnementByDateDebut(datedeb,datefin);
    }

}
