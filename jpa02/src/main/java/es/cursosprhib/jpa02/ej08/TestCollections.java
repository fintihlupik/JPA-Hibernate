package es.cursosprhib.jpa02.ej08;

import es.cursosprhib.jpa02.EMF;
import jakarta.persistence.EntityManager;

public class TestCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMF.getInstance().createEntityManager();
		Persona07 p = em.find(Persona07.class, 2);
		System.out.println(p);
		System.out.println(p.getTelefonos());
		
		System.out.println(p.getTelefonos().size());

		
	}

}
