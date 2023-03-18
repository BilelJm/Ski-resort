package tn.spring.bilelproject.Service.Abonnement;

import org.springframework.data.repository.query.Param;
import tn.spring.bilelproject.entities.Abonnement;
import tn.spring.bilelproject.entities.TypeAbonnement;

import java.util.Date;
import java.util.List;

public interface IAbonnementServices {

    List<Abonnement> retrieveAllAbonnements();

    Abonnement addAbonnement(Abonnement abonnement);

    Abonnement updateAbonnement (Abonnement abonnement);

    Abonnement retrieveAbonnement (Long numAbonnement);
    void removeAbonnement (Long numAbonnement);

    List<Abonnement> getAbonnementByTypeAbonnementOrderByDateDebut(@Param("type") TypeAbonnement type);
    List<Abonnement> getAbonnementByDateDebut(Date dated, Date datef);


}
