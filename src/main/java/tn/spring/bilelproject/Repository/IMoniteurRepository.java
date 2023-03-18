package tn.spring.bilelproject.Repository;

import tn.spring.bilelproject.entities.Moniteur;
import tn.spring.bilelproject.entities.Support;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface IMoniteurRepository extends JpaRepository<Moniteur,Long> {

    @Query("select inscription.numSemaine from Moniteur moniteur join moniteur.cours c join Inscription inscription " +
            "on inscription.cours.numCours=c.numCours " +
            "where moniteur.numMoniteur=:moniteurnum " +
            "and c.support=:support")
    Integer GetWeeksNumber(@Param("moniteurnum")Long moniteurnum,@Param("support") Support support);

}
