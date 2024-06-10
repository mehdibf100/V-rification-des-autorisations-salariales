package com.projet1.projetpersonne.service;

import com.projet1.projetpersonne.entity.RetraiteTab;
import com.projet1.projetpersonne.entity.SalaryTab;
import com.projet1.projetpersonne.entity.Student;
import com.projet1.projetpersonne.respository.RetraiteTabRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

@Service
public class RetraiteTabService {
    @Autowired
    RetraiteTabRespository respository;
    public RetraiteTab saveRetraiteTab(RetraiteTab retraiteTab){
        RetraiteTab saveRetraiteTab=respository.save(retraiteTab);

        System.out.println(saveRetraiteTab);
        return saveRetraiteTab;
    }
    public List<RetraiteTab> getAllRetraiteTab(){
        return respository.findAll();
    }

    public String getRetraiteTabByID() {
        String tableau=this.getAllRetraiteTab().toString();
        tableau = tableau.substring(1, tableau.length() - 1);
        tableau = tableau.replaceAll("[\\[\\]\\s]", "").replace(",", "\n");
        try {
            FileWriter fileWriter = new FileWriter("RetraiteTab.txt", false);
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
    public void deleteRetraiteTabByID(Long id) throws Exception {
        respository.findById(id).orElseThrow(()-> new Exception("Employee no found with id: "+id));
        respository.deleteById(id);
        System.out.println("Employee deleted with Num : "+id);

    }
    public RetraiteTab updateRetraiteTab(RetraiteTab retraiteTab) throws Exception {
        respository.findById(retraiteTab.getId()).orElseThrow(()-> new Exception("Student no found with id: "+retraiteTab.getId()));
        return respository.save(retraiteTab);
    }

}
