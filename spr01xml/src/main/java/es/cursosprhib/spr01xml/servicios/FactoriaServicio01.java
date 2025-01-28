package es.cursosprhib.spr01xml.servicios;

public class FactoriaServicio01 {
	
	public static Servicio01 getInstance(){
		System.out.println("Creando servicio x Factoria");
		return new Servicio01Impl();
	}
}
