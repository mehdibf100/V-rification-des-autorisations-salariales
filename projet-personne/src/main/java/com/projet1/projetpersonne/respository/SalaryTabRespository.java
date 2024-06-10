package com.projet1.projetpersonne.respository;


import com.projet1.projetpersonne.entity.SalaryTab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryTabRespository extends JpaRepository<SalaryTab,Integer> {
}
