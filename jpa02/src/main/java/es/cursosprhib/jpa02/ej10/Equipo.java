package es.cursosprhib.jpa02.ej10;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos_03")
public class Equipo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idequipo")
	private Integer idEquipo;
	
	private String equipo;
	
	@ManyToMany
	@JoinTable(name = "equipos_jugadores_03",
				joinColumns = @JoinColumn(name = "idequipo"), 
				inverseJoinColumns = @JoinColumn(name = "idjugador"))
	private Set<Jugador> jugadores;
	
	
	
	public Integer getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(Integer idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(idEquipo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(idEquipo, other.idEquipo);
	}
	@Override
	public String toString() {
		return "Jugador [idEquipo=" + idEquipo + ", equipo=" + equipo + "]";
	}

}
