package com.spring.gestionpointeuse.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter @Setter @ToString @NoArgsConstructor
public class Fonctionalitie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFonctionalities;

    private Boolean lecture ;
    private Boolean ajout ;
    private Boolean modification ;
    private Boolean suppression ;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idUsager")
    @JsonIgnoreProperties({"fonctionalities"})
    private Usager usager;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idFonction")
    @JsonIgnoreProperties({"fonctionalities"})
    private Fonction fonction;

    public Fonctionalitie(Fonction fonction,Boolean lecture, Boolean ajout, Boolean modif, Boolean supprime,Usager usager) {
        this.fonction = fonction;
        this.lecture = lecture;
        this.ajout = ajout;
        this.modification = modif;
        this.suppression = supprime;
        this.usager = usager;
    }
}
