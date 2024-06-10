package com.projet1.projetpersonne.controller;


import com.projet1.projetpersonne.entity.RetraiteTab;
import com.projet1.projetpersonne.entity.SalaryTab;
import com.projet1.projetpersonne.entity.Student;
import com.projet1.projetpersonne.service.RetraiteTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/TableRetraite")
public class RetraiteTabController {
    @Autowired
    RetraiteTabService service;
    @PostMapping
    public RetraiteTab saveRetraiteTab(@RequestBody RetraiteTab RetraiteTab){
        System.out.println("hello");
        return service.saveRetraiteTab(RetraiteTab);
    }
    @GetMapping
    public List<RetraiteTab> getAllSalaryTab(){
        return  service.getAllRetraiteTab();
    }
    @GetMapping("/conv")
    public String getRetraiteTab() throws Exception {
        return service. getRetraiteTabByID();
    }
    @DeleteMapping("/{id}")
    public String deleteRetraiteTabById(@PathVariable Long id) throws Exception {
        service.deleteRetraiteTabByID(id);
        return "Table delete successfully";
    }
    @PutMapping
    public RetraiteTab updateRetraiteTab(@RequestBody RetraiteTab retraiteTab) throws Exception {
        return service.updateRetraiteTab(retraiteTab);

    }

}
