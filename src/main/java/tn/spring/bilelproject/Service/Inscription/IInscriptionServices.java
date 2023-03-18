package tn.spring.bilelproject.Service.Inscription;

import tn.spring.bilelproject.entities.Inscription;

import java.util.List;

public interface IInscriptionServices

{
    List<Inscription> retrieveAllInscriptions();

    Inscription addInscription(Inscription inscription);

    Inscription updateInscription (Inscription inscription);

    Inscription retrieveInscription (Long numInscription);
    void removeInscription(Long numInscription);
}
