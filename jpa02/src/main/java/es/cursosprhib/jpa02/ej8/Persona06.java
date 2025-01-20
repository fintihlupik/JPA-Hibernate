package es.cursosprhib.jpa02.ej8;

import java.io.Serializable;

import es.cursosprhib.jpa02.ej02.Genero;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
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
public class Persona06 implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="idcontacto")
	private Integer idPersona;
	private String nombre;
	private String apellidos;
	private String apodo;

	
	@OneToOne
	@JoinColumn(name = "iddomicilio")
	private Domicilio domicilio;
	


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



	public Domicilio getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}



	@Override
	public String toString() {
		return "Persona06 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", domicilio=" + domicilio + "]";
	}


	



	
	
	
	
	
	

}
