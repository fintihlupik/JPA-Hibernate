package es.cursosprhib.jpa02.ej08;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import es.cursosprhib.jpa02.ej02.Genero;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "contacto")
public class Persona07 implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="idcontacto")
	private Integer idPersona;
	private String nombre;
	private String apellidos;
	private String apodo;

	
	@OneToOne
	@JoinColumn(name = "iddomicilio")
	private Domicilio02 domicilio;
	
	@ElementCollection
	@CollectionTable(name = "telefonos", joinColumns = @JoinColumn(name = "idcontacto")) // creo una tabla telefonos idcontact es una FK a la tabla contactp
	@Column(name = "telefono")
	private Set<String> telefonos; // es un Set pq no hay telefonos repetidos (en un List p haber valores repetidos)
	

	public void addTelefono(String telefono) {
		telefonos.add(telefono);
	}
	

	public Persona07() {
		telefonos = new LinkedHashSet<String>(); // esto lo hago p/q en el metodo addTelefono no me de un nullpointerexception al no existir el objeto telefonos. Es un Hash Set pq no hay telefonos repetodos (en un List p haber), es mas eficiente
	}










	public void setIdPersona(Integer idPersona) {
		System.out.println("acceso a set id");
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		System.out.println("acceso a set nombre");
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}



	public Domicilio02 getDomicilio02() {
		return domicilio;
	}



	public void setDomicilio02(Domicilio02 domicilio) {
		this.domicilio = domicilio;
	}

	

	public Set<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}

	@Override
	public String toString() {
		return "Persona06 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio + "]";
	}


	



	
	
	
	
	
	

}
