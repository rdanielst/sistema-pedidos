package com.aggb.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aggb.model.Usuario;

public class TesteCon {
	
	public static void main(String[] args) {
		
		try {
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("GerenciadorAcesso");
			
			EntityManager em = factory.createEntityManager();
			
			em.createQuery("select u from Usuario u", Usuario.class);
			System.out.println("Conectou...");
			
		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
