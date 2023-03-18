package tn.spring.bilelproject.Service.Abonnement;

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

   List<Abonnement> GetAbonnementByType(TypeAbonnement typeAbonnement);
    List<Abonnement>GetListAbonnementBy2Date(Date datedeb,Date datefin);


}
