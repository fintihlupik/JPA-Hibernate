package es.cursosprhib.jpa02.ej02;

import es.cursosprhib.jpa02.EMF;
import jakarta.persistence.EntityManager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getInstance().createEntityManager();
		
		Persona02 p = em.find(Persona02.class, 10);
		Persona02 otra = em.find(Persona02.class, 11);
		
		p.setApodo("Ramita");
		
		Persona02 nueva = new Persona02();
		nueva.setApellidos("apell");
		nueva.setApodo("apod");
		nueva.setDni("67976");
		nueva.setNombre("nombre");
		nueva.setGenero(Genero.H);
		
		em.getTransaction().begin();
		em.persist(nueva);
		em.getTransaction().commit();
		
		System.out.println(p);
		System.out.println(otra);
	}

}
