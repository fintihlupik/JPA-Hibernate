package es.cursosprhib.jpa03ejerciciojpa.consultas;

import java.util.List;

import es.cursosprhib.jpa03ejerciciojpa.EMF;
import es.cursosprhib.jpa03ejerciciojpa.modelo.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class C02 {
	public static void main(String[] args) {
	EntityManager em = EMF.getInstance().createEntityManager();
	
	String categoria = "PROGRAMADOR SR";
	String jpql = "select e from Empleado e where e.categoria.categoria = :cat";  // or e.categoria.idCategoria si int cat = 5 p.ej
	TypedQuery<Empleado> q = em.createQuery(jpql,Empleado.class);
	q.setParameter("cat", categoria);
	
	List<Empleado> elis = q.getResultList();
	
	for(Empleado emp : elis) {
		System.out.println(emp);
	}
	
 }
}

