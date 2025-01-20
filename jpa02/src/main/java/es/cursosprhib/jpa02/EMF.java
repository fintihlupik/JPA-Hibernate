package es.cursosprhib.jpa02;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMF {
	private static EntityManagerFactory emf;
	
	private EMF() {}  //es p/q se cree solo una instancia de emf 
	
	public static EntityManagerFactory getInstance() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("cursojpa");
		}
		return emf;
	}
}
