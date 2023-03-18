package tn.spring.bilelproject.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class Voiture implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    Personne personne;

}
