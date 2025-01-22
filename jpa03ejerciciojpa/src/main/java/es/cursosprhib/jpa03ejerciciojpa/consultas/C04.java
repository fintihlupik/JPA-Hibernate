package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class C04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManager em = EMF.getInstance().createEntityManager();
		
		Double precio = 205.0;
		String jpql = "select p.clientes from Producto p where p.precio > :prec";
		//String jpql = "select c from Cliente c join c.productos p where p.precio > :prec";
		TypedQuery<Cliente> q = em.createQuery(jpql,Cliente.class);
		q.setParameter("prec", precio);
		
		List<Cliente> clis = q.getResultList();
		
		for(Cliente cliente : clis) {
			System.out.println(cliente);
		}

	}

}
