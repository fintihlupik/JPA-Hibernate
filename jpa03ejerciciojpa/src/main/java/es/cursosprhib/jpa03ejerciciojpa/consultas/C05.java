package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class C05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EntityManager em = EMF.getInstance().createEntityManager();
		
		Integer nCl = 7;
		String jpql = "select c.productos from Cliente c where c.idPersona = :nCliente"; //el Cliente hereda de Persona y x eso no tiene su propio Id, su Id es el Id de la Persona! por eso pongo c.idPersona y no c.nroCliente !
		//string jpql = 
		TypedQuery<Producto> q = em.createQuery(jpql,Producto.class);
		q.setParameter("nCliente", nCl);
		
		Set<Producto> prlis = new LinkedHashSet<>(q.getResultList());
		
		for(Producto producto : prlis) {
			System.out.println(producto);
		
	}

		
}
}
