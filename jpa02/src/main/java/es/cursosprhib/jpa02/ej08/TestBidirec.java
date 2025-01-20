package es.cursosprhib.jpa02.ej08;

import es.cursosprhib.jpa02.EMF;
import jakarta.persistence.EntityManager;

public class TestBidirec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMF.getInstance().createEntityManager();
		Persona07 p = em.find(Persona07.class, 6);
		System.out.println(p);

		Domicilio02 dom = em.find(Domicilio02.class,4);
		System.out.println(dom);
		System.out.println(dom.getPersona());
		
	}

}
