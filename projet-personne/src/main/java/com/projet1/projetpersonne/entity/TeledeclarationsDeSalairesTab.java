package com.projet1.projetpersonne.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TeledeclarationsDeSalairesTab {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String Matricule;

    @Column
    private String Cle;

    @Column
    private String CodeDExploitation;

    @Column
    private String Trimestre;

    @Column
    private String Annee;

    @Column
    private  String NumPage;

    @Column
    private String NumLigne;

    @Column
    private String MatriculeDeNumAssureSocial;

    @Column
    private String CleDeNumAssureSocial;

    @Column
    private String IdentiteAssure;

    @Column
    private String NumCarteDIdentite;

    @Column
    private String Salaire;

    @Column String ZoneVierge;

    public TeledeclarationsDeSalairesTab() {
    }

    public TeledeclarationsDeSalairesTab(Long id, String matricule, String cle, String codeDExploitation, String trimestre, String annee, String numPage, String numLigne, String matriculeDeNumAssureSocial, String cleDeNumAssureSocial, String identiteAssure, String numCarteDIdentite, String salaire, String zoneVierge) {
        this.id = id;
        Matricule = matricule;
        Cle = cle;
        CodeDExploitation = codeDExploitation;
        Trimestre = trimestre;
        Annee = annee;
        NumPage = numPage;
        NumLigne = numLigne;
        MatriculeDeNumAssureSocial = matriculeDeNumAssureSocial;
        CleDeNumAssureSocial = cleDeNumAssureSocial;
        IdentiteAssure = identiteAssure;
        NumCarteDIdentite = numCarteDIdentite;
        Salaire = salaire;
        ZoneVierge = zoneVierge;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String matricule) {
        Matricule = matricule;
    }

    public String getCle() {
        return Cle;
    }

    public void setCle(String cle) {
        Cle = cle;
    }

    public String getCodeDExploitation() {
        return CodeDExploitation;
    }

    public void setCodeDExploitation(String codeDExploitation) {
        CodeDExploitation = codeDExploitation;
    }

    public String getTrimestre() {
        return Trimestre;
    }

    public void setTrimestre(String trimestre) {
        Trimestre = trimestre;
    }

    public String getAnnee() {
        return Annee;
    }

    public void setAnnee(String annee) {
        Annee = annee;
    }

    public String getNumPage() {
        return NumPage;
    }

    public void setNumPage(String numPage) {
        NumPage = numPage;
    }

    public String getNumLigne() {
        return NumLigne;
    }

    public void setNumLigne(String numLigne) {
        NumLigne = numLigne;
    }

    public String getMatriculeDeNumAssureSocial() {
        return MatriculeDeNumAssureSocial;
    }

    public void setMatriculeDeNumAssureSocial(String matriculeDeNumAssureSocial) {
        MatriculeDeNumAssureSocial = matriculeDeNumAssureSocial;
    }

    public String getCleDeNumAssureSocial() {
        return CleDeNumAssureSocial;
    }

    public void setCleDeNumAssureSocial(String cleDeNumAssureSocial) {
        CleDeNumAssureSocial = cleDeNumAssureSocial;
    }

    public String getIdentiteAssure() {
        return IdentiteAssure;
    }

    public void setIdentiteAssure(String identiteAssure) {
        IdentiteAssure = identiteAssure;
    }

    public String getNumCarteDIdentite() {
        return NumCarteDIdentite;
    }

    public void setNumCarteDIdentite(String numCarteDIdentite) {
        NumCarteDIdentite = numCarteDIdentite;
    }

    public String getSalaire() {
        return Salaire;
    }

    public void setSalaire(String salaire) {
        Salaire = salaire;
    }

    public String getZoneVierge() {
        return ZoneVierge;
    }

    public void setZoneVierge(String zoneVierge) {
        ZoneVierge = zoneVierge;
    }

    @Override
    public String toString() {
        return  Matricule
                + Cle + CodeDExploitation + Trimestre + Annee + NumPage + NumLigne + MatriculeDeNumAssureSocial + CleDeNumAssureSocial + IdentiteAssure + NumCarteDIdentite + Salaire + ZoneVierge+"\n";
    }
}
