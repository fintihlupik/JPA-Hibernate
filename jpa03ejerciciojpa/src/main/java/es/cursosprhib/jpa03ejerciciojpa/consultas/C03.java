package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class C03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = EMF.getInstance().createEntityManager();
		
		String categoria = "PROGRAMADOR SR";
		String apellido = "Galarza";
		String jpql = "select e from Empleado e where e.categoria.categoria = :cat and e.apellidos = :ape";
		TypedQuery<Empleado> q = em.createQuery(jpql,Empleado.class);
		q.setParameter("cat", categoria);
		q.setParameter("ape", apellido);
		
		List<Empleado> elis = q.getResultList();
		
		for(Empleado emp : elis) {
			System.out.println(emp);
		}

	}

}
