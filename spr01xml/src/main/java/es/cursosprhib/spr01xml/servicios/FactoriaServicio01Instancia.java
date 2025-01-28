package es.cursosprhib.spr01xml.servicios;

public class FactoriaServicio01Instancia {
	
	public Servicio01 getInstance(){
		System.out.println("Creando servicio x Factoria nueva");
		return new Servicio01Impl();
	}
}
