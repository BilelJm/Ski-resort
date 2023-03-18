package tn.spring.bilelproject.Repository;

import tn.spring.bilelproject.entities.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IInscriptionRepository extends JpaRepository<Inscription, Long> {
}
