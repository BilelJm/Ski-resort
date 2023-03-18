package tn.spring.bilelproject.Repository;

import tn.spring.bilelproject.entities.Couleur;
import tn.spring.bilelproject.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IPisteRepository extends JpaRepository<Piste, Long> {

    Piste findByNomPisteAndCouleur(String nomPiste, Couleur couleur);
}
