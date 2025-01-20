package es.cursosprhib.jpa02.ej04;

import java.io.Serializable;
import java.util.Objects;

public class Persona04Id implements Serializable{
	
	
	public int getNroDoc() {
		return nroDoc;
	}
	public void setNroDoc(int nroDoc) {
		this.nroDoc = nroDoc;
	}
	public char getLetraDoc() {
		return letraDoc;
	}
	public void setLetraDoc(char letraDoc) {
		this.letraDoc = letraDoc;
	}
	private int nroDoc;  // se p dejar int y no Integer pq es una clave compuesta
	private char letraDoc;

	
	
	public Persona04Id() {
		super();
	}
	public Persona04Id(int nroDoc, char letraDoc) {
		super();
		this.nroDoc = nroDoc;
		this.letraDoc = letraDoc;
	}
	@Override
	public int hashCode() {
		return Objects.hash(letraDoc, nroDoc);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona04Id other = (Persona04Id) obj;
		return letraDoc == other.letraDoc && nroDoc == other.nroDoc;
	} 
	
	
}
