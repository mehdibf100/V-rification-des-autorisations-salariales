package com.projet1.projetpersonne.controller;


import com.projet1.projetpersonne.entity.TeledeclarationsDeSalairesTab;
import com.projet1.projetpersonne.service.TeledeclarationsDeSalairesTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/TeledeclarationsDeSalairesTabController")
public class TeledeclarationsDeSalairesTabController {
    @Autowired
    TeledeclarationsDeSalairesTabService service;

    @PostMapping
    public TeledeclarationsDeSalairesTab saveTeledeclarationsDeSalairesTabController(@RequestBody TeledeclarationsDeSalairesTab teledeclarationsDeSalairesTabController){
        System.out.println("hello");
        return service.saveTeledeclarationsDeSalairesTab(teledeclarationsDeSalairesTabController);
    }
    @GetMapping("All")
    public List<TeledeclarationsDeSalairesTab> getAllSalaryTab(){
        return service.getAllTeledeclarationsDeSalairesTab();
    }
    @GetMapping("/conv")
    public String getTeledeclarationsDeSalairesTab() throws Exception {
        return service. getTeledeclarationsDeSalairesTabByID();
    }
    @DeleteMapping("/{id}")
    public String deleteTeledeclarationsDeSalairesTabControllerById(@PathVariable Long id) throws Exception {
        service.deleteTeledeclarationsDeSalairesTabByID(id);
        return "Table delete successfully";
    }
    @PutMapping
    public TeledeclarationsDeSalairesTab updateTeledeclarationsDeSalairesTab(@RequestBody TeledeclarationsDeSalairesTab teledeclarationsDeSalairesTab) throws Exception {
        return service.updateTeledeclarationsDeSalairesTab(teledeclarationsDeSalairesTab);

    }

}
