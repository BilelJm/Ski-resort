package tn.spring.bilelproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkieur;
    private String nomS;
    private String prenomS;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private String ville;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Piste> pistes= new ArrayList<>();
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions = new ArrayList<Inscription>();
    @OneToOne(cascade = CascadeType.PERSIST)
    private Abonnement abonnements;


    public List<Piste> getPistes() {
        return pistes;
    }

    public void setPistes(List<Piste> pistes) {
        this.pistes = pistes;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public Abonnement getAbonnements() {
        return abonnements;
    }

    public void setAbonnements(Abonnement abonnements) {
        this.abonnements = abonnements;
    }
}
