package es.cursosprhib.jpa02.ej03;

import es.cursosprhib.jpa02.EMF;
import jakarta.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMF.getInstance().createEntityManager();
		Persona03 p = em.find(Persona03.class, 7);
		System.out.println(p);

		//Persona03 p2 = new Persona03("nombre","1235678");
		
	}

}
