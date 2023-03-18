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

    @Query (value = "SELECT *  from abonnement a where a.type_abonnement =:type  " +
            "order by a.date_debut", nativeQuery = true)
    List<Abonnement> getAbonnementByTypeAbonnementOrderByDateDebut(@Param("type") TypeAbonnement type);

    @Query (value = "select * from abonnement a where a.date_debut BETWEEN ?1 and ?2",
            nativeQuery = true)
    List<Abonnement> getAbonnementByDateDebut(Date dated, Date datef);


}
