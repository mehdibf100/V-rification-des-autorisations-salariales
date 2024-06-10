package com.projet1.projetpersonne.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class RetraiteTab {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NumEmployee")
    private String numEmployee;

    @Column(name = "NumeroAssureSocial")
    private String numeroAssureSocial;

    @Column(name = "EntreeSortie")
    private String entreeSortie;

    @Column(name = "DateD’EntréeSortie ")
    private String dateEntreeSortie ;

    public RetraiteTab() {
    }

    public RetraiteTab(Long id, String numEmployee, String numeroAssureSocial, String entreeSortie, String dateEntreeSortie) {
        this.id = id;
        this.numEmployee = numEmployee;
        this.numeroAssureSocial = numeroAssureSocial;
        this.entreeSortie = entreeSortie;
       this.dateEntreeSortie = dateEntreeSortie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(String numEmployee) {
        this.numEmployee = numEmployee;
    }

    public String getNumeroAssureSocial() {
        return numeroAssureSocial;
    }

    public void setNumeroAssureSocial(String numeroAssureSocial) {
        this.numeroAssureSocial = numeroAssureSocial;
    }

    public String getEntreeSortie() {
        return entreeSortie;
    }

    public void setEntreeSortie(String entreeSortie) {
        this.entreeSortie = entreeSortie;
    }

    public String getDateEntreeSortie() {
        return dateEntreeSortie;
    }

    public void setDateEntreeSortie(String dateEntreeSortie) {
        this.dateEntreeSortie = dateEntreeSortie;
    }

    @Override
    public String toString() {
        return numEmployee + numeroAssureSocial + entreeSortie + dateEntreeSortie+"\n" ;
    }
}

