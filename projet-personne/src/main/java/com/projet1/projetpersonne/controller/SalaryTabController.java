package com.projet1.projetpersonne.controller;

import com.projet1.projetpersonne.entity.SalaryTab;
import com.projet1.projetpersonne.entity.Student;
import com.projet1.projetpersonne.service.SalaryTabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/TableSalary")
public class SalaryTabController {
    @Autowired
    SalaryTabService service;

    @PostMapping
    public SalaryTab saveSalaryTab(@RequestBody SalaryTab salaryTab){

        return service.saveTab(salaryTab);
    }
    @GetMapping
    public List<SalaryTab> getAllSalaryTab(){
        return service.getAllSalaryTab();
    }
    @DeleteMapping("/{id}")
    public String deleteSalatyTabById(@PathVariable Integer id) throws Exception {
        service.deleteSalaryTabByID(id);
        return "Table delete successfully";
    }
    @GetMapping("/conv")
    public String getSalaryTab() throws Exception {
        return service. getSTabSalaryByID();
    }
    @PutMapping
    public SalaryTab updateSalaryTab(@RequestBody SalaryTab salaryTab) throws Exception {
        return service.updateSalaryTab(salaryTab);
    }}
