package com.projet1.projetpersonne.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class SalaryTab {



    @Id
    @GeneratedValue
    private   Integer id;

    @Column(name = "NumEmployee")
    private String numEmployee;
    @Column(name = "NumeroAssureSocial")
    private String numeroAssureSocial;

    @Column(name = "SalaireDeclare")
    private String salaireDeclare;

    @Column(name = "SalairePlafonne")
    private String salairePlafonne;

    @Column(name = "SalaireDifferentiel")
    private String salaireDifferentiel;

    public SalaryTab() {
    }

    public SalaryTab(Integer id, String numEmployee, String numeroAssureSocial, String salaireDeclare, String salairePlafonne, String salaireDifferentiel) {
        this.id = id;
        this.numEmployee = numEmployee;
        this.numeroAssureSocial = numeroAssureSocial;
        this.salaireDeclare = salaireDeclare;
        this.salairePlafonne = salairePlafonne;
        this.salaireDifferentiel = salaireDifferentiel;
    }

    public String getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(String numEmployee) {
        this.numEmployee = numEmployee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroAssureSocial() {
        return numeroAssureSocial;
    }

    public void setNumeroAssureSocial(String numeroAssureSocial) {
        this.numeroAssureSocial = numeroAssureSocial;
    }

    public String getSalaireDeclare() {
        return salaireDeclare;
    }

    public void setSalaireDeclare(String salaireDeclare) {
        this.salaireDeclare = salaireDeclare;
    }

    public String getSalairePlafonne() {
        return salairePlafonne;
    }

    public void setSalairePlafonne(String salairePlafonne) {
        this.salairePlafonne = salairePlafonne;
    }

    public String getSalaireDifferentiel() {
        return salaireDifferentiel;
    }

    public void setSalaireDifferentiel(String salaireDifferentiel) {
        this.salaireDifferentiel = salaireDifferentiel;
    }

    @Override
    public String toString() {
        return   numEmployee +numeroAssureSocial + salaireDeclare + salairePlafonne+ salaireDifferentiel+"\n" ;
    }

}
