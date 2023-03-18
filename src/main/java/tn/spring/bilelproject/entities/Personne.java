package tn.spring.bilelproject.entities;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.*;

public class Personne implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private List<Voiture> voitureList;

    private Date birthdate;
    @Enumerated(EnumType.STRING)
    private Orientation option;
    public Personne(){
        super();
    }
    public Personne( String nom, String prenom,Date birthdate,Orientation option)
    {
        super();
        this.nom=nom;
        this.prenom=prenom;
        this.birthdate=birthdate;
        this.option=option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Orientation getOption() {
        return option;
    }

    public void setOption(Orientation option) {
        this.option = option;
    }
}
