package es.cursosprhib.jpa02.ej03;

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
import jakarta.persistence.Table;


@Entity
@Table(name = "persona_04")
public class Persona03 implements Serializable{
	
	
	
	private Integer idPersona;
	private String nombre;
	private String apellidos;
	private String apodo;
	private String dni;
	
	
	private Genero genero;
	private Domicilio domicilio;
	
	
	
	
	public Persona03() {
		System.out.println("Soy tu constructor x defecto");
	}

	
	
	public Persona03(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdPersona() {
		return idPersona;
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
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Column(name = "genero")
	@Enumerated(EnumType.STRING) // si no pongo este String 
	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	
	@Embedded
	@AttributeOverride(column = @Column(name="tipovia"), name = "tipoVia")
	@AttributeOverride(column = @Column(name="codigopostal"), name = "codigoPostal")
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona02 [idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellidos + ", apodo="
				+ apodo + ", dni=" + dni + ", genero=" + genero + "]";
	}



	
	
	
	
	
	

}
