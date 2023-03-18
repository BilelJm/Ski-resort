package tn.spring.bilelproject.Repository;

import tn.spring.bilelproject.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ICoursRepository extends JpaRepository<Cours,Long> {

}
