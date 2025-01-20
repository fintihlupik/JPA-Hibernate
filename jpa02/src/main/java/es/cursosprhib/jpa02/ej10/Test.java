package es.cursosprhib.jpa02.ej10;

import es.cursosprhib.jpa02.EMF;
import jakarta.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = EMF.getInstance().createEntityManager();
		Jugador j = em.find(Jugador.class, 10);
		
		System.out.println(j);
		
		for(Equipo eq : j.getEquipos()) {
			System.out.println(eq);
		}
		
		System.out.println(j.getEquipos());
	}

}
