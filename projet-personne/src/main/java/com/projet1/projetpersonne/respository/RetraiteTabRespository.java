package com.projet1.projetpersonne.respository;

import com.projet1.projetpersonne.entity.RetraiteTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RetraiteTabRespository extends JpaRepository<RetraiteTab,Long> {
}
