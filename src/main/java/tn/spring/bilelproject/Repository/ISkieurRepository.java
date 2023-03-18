package tn.spring.bilelproject.Repository;

import tn.spring.bilelproject.entities.Skieur;
import tn.spring.bilelproject.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ISkieurRepository extends JpaRepository<Skieur,Long> {

    @Query("select s from Skieur s where s.abonnements.typeAbon=:typeAbonnement")
    List<Skieur> retrieveSkiersBySubscriptionType(@Param("typeAbonnement") TypeAbonnement typeAbonnement);
}