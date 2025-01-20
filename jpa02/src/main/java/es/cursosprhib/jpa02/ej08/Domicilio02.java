package es.cursosprhib.jpa02.ej08;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable; //en un insertable no se ponen @Column pq puede dar errores con mas historias si lo escalas
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "domicilio")
public class Domicilio02 implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddomicilio")
	private Integer idDomicilio;
	@Column (name = "tipovia")
	private String tipoVia;
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	private String ciudad;
	
	@OneToOne(mappedBy = "domicilio") //mapeado en el atributo domiciliio de la clase Persona07
	private Persona07 persona;
	
	
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getPuerta() {
		return puerta;
	}
	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public Persona07 getPersona() {
		return persona;
	}
	public void setPersona(Persona07 persona) {
		this.persona = persona;
	}
	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", tipoVia=" + tipoVia + ", via=" + via + ", numero=" + numero
				+ ", piso=" + piso + ", puerta=" + puerta + ", ciudad=" + ciudad + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idDomicilio);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio02 other = (Domicilio02) obj;
		return Objects.equals(idDomicilio, other.idDomicilio);
	}
	public Integer getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	
	
}
