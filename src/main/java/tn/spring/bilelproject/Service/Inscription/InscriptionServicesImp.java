package tn.spring.bilelproject.Service.Inscription;

import tn.spring.bilelproject.entities.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionServicesImp implements IInscriptionServices
{
    @Autowired
    tn.spring.bilelproject.Repository.IInscriptionRepository IInscriptionRepository;


    @Override
    public List<Inscription> retrieveAllInscriptions() {
        return IInscriptionRepository.findAll();
    }

    @Override
    public Inscription addInscription(Inscription inscription) {
        return IInscriptionRepository.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return IInscriptionRepository.save(inscription);
    }

    @Override
    public Inscription retrieveInscription(Long numInscription) {
        return IInscriptionRepository.findById(numInscription).get();
    }

    @Override
    public void removeInscription(Long numInscription) {
        IInscriptionRepository.deleteById(numInscription);
    }
}
