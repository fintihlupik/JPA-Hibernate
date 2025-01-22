package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


public class C01 {
	public static void main(String[] args) {
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String categoria = "VIP";
		String jpql = "select c from Cliente c where c.categoria = :cat";
		TypedQuery<Cliente> q = em.createQuery(jpql,Cliente.class);
		q.setParameter("cat", categoria);
		
		List<Cliente> clis = q.getResultList();
		
		for(Cliente cliente : clis) {
			System.out.println(cliente);
		}
		
	}

}
