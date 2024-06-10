package com.projet1.projetpersonne.service;

import com.projet1.projetpersonne.entity.SalaryTab;
import com.projet1.projetpersonne.respository.SalaryTabRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

@Service
public class SalaryTabService {
    @Autowired
    SalaryTabRespository respository;
    public SalaryTab saveTab(SalaryTab salaryTab){
        SalaryTab saveSalary=respository.save(salaryTab);

        System.out.println(saveSalary);
        return saveSalary;
    }
    public List<SalaryTab> getAllSalaryTab(){
        return respository.findAll();
    }
    public String getSTabSalaryByID() throws Exception {
        String tableau=this.getAllSalaryTab().toString();
        tableau = tableau.substring(1, tableau.length() - 1);
        tableau = tableau.replaceAll("[\\[\\]\\s]", "").replace(",", "\n");
        try {
            FileWriter fileWriter = new FileWriter("SalaryTab.txt", false);
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
    public void deleteSalaryTabByID(Integer id) throws Exception {
        respository.findById(id).orElseThrow(()-> new Exception("Employee no found with id: "+id));
        respository.deleteById(id);
        System.out.println("Employee deleted with Num : "+id);

    }
    public SalaryTab updateSalaryTab(SalaryTab salaryTab) throws Exception {
        respository.findById(salaryTab.getId()).orElseThrow(()-> new Exception("Student no found with id: "+salaryTab.getId()));
        return respository.save(salaryTab);
    }
}
