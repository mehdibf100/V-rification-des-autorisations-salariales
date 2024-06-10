package com.projet1.projetpersonne;

import com.projet1.projetpersonne.entity.SalaryTab;
import com.projet1.projetpersonne.entity.Student;
import com.projet1.projetpersonne.respository.SalaryTabRespository;
import com.projet1.projetpersonne.respository.StudentRespository;
import com.projet1.projetpersonne.service.SalaryTabService;
import com.projet1.projetpersonne.service.StudentService;
import org.hibernate.query.IllegalSelectQueryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;

@SpringBootApplication
public class ProjetPersonneApplication implements CommandLineRunner{

	@Autowired
	SalaryTabService service;
		public static void main(String[] args) {

			SpringApplication.run(ProjetPersonneApplication.class, args);

		}


	@Override
	public void run(String... args) throws Exception {

		/*SalaryTab salaryTab=new SalaryTab(1232,"223","3223","234","2323");
		SalaryTab saveTab=service.saveTab(salaryTab);
		System.out.println("Table saved: "+ saveTab);
		try {
			FileWriter fileWriter = new FileWriter("file.txt", false); // Utilisation d'un chemin relatif
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write(salaryTab.toString());
			writer.newLine();
			writer.close();
		} catch (IllegalSelectQueryException e) {
			e.printStackTrace();
			System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
		}*/
	}

	}

