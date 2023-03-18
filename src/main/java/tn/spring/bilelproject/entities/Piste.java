package tn.spring.bilelproject.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String nomPiste;
    private Couleur couleur;
    private int longeur;
    private int pente;
    @ManyToMany(mappedBy = "pistes")
    private List<Skieur> skieurs;

    public List<Skieur> getSkieurs() {
        return skieurs;
    }

    public void setSkieurs(List<Skieur> skieurs) {
        this.skieurs = skieurs;
    }
}
