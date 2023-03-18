package tn.spring.bilelproject.Repository;

import tn.spring.bilelproject.entities.Abonnement;
import tn.spring.bilelproject.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface IAbonnementRepository extends JpaRepository<Abonnement,Long> {

    @Query("SELECT a from Abonnement a where a.typeAbon=?1 order by a.dateDebut")
    List<Abonnement> GetAbonnementByType(TypeAbonnement typeAbonnement);

    @Query("select a from Abonnement a where a.dateDebut>=:datedeb and a.dateFin<=:datefin")
    List<Abonnement>GetListAbonnementBy2Date(@Param("datedeb") Date datedeb,@Param("datefin") Date datefin);


}
