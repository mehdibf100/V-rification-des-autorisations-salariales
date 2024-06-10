package com.projet1.projetpersonne.service;


import com.projet1.projetpersonne.entity.TeledeclarationsDeSalairesTab;
import com.projet1.projetpersonne.respository.TeledeclarationsDeSalairesTabRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

@Service
public class TeledeclarationsDeSalairesTabService {
    @Autowired
    TeledeclarationsDeSalairesTabRespository respository;

    public TeledeclarationsDeSalairesTab saveTeledeclarationsDeSalairesTab(TeledeclarationsDeSalairesTab teledeclarationsDeSalairesTab){
        TeledeclarationsDeSalairesTab saveTeledeclarationsDeSalairesTab=respository.save(teledeclarationsDeSalairesTab);

        System.out.println(saveTeledeclarationsDeSalairesTab);
        return saveTeledeclarationsDeSalairesTab;
    }
    public List<TeledeclarationsDeSalairesTab> getAllTeledeclarationsDeSalairesTab(){
        return respository.findAll();
    }

    public String getTeledeclarationsDeSalairesTabByID() throws Exception {
        String tableau=this.getAllTeledeclarationsDeSalairesTab().toString();
        tableau = tableau.substring(1, tableau.length() - 1);
        tableau = tableau.replaceAll("[\\[\\]\\s]", "").replace(",", "\n").replace("*"," ");
        try {
        FileWriter fileWriter = new FileWriter("TeledeclarationsDeSalairesTab.txt", false);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write(tableau);
        writer.newLine();
        writer.close();
    } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
    }
        return "Table Saved";
    }
    public void deleteTeledeclarationsDeSalairesTabByID(Long id) throws Exception {
        respository.findById(id).orElseThrow(()-> new Exception("Employee no found with id: "+id));
        respository.deleteById(id);
        System.out.println("Employee deleted with Num : "+id);

    }
    public TeledeclarationsDeSalairesTab updateTeledeclarationsDeSalairesTab(TeledeclarationsDeSalairesTab teledeclarationsDeSalairesTab) throws Exception {
        respository.findById(teledeclarationsDeSalairesTab.getId()).orElseThrow(()-> new Exception("Student no found with id: "+teledeclarationsDeSalairesTab.getId()));
        return respository.save(teledeclarationsDeSalairesTab);
    }
}
