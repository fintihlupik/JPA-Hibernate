package es.cursosprhib.spr01xml.servicios;

public class Servicio01Impl implements Servicio01{
	
	private String descripcion;
	
	

	public Servicio01Impl() {
		System.out.println("Constructor x defecto del Servicio01Impl");
	}
	
	public Servicio01Impl(String descripcion) {
		this.descripcion = descripcion;
		System.out.println("Constructor Servicio01Impl(String)");
	}
	
	public Servicio01Impl(String descripcion, int num) {
		this.descripcion = descripcion;
		System.out.println("Constructor Servicio01Impl(String e Int)");
		System.out.println(num);
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Metodo de Servicio01Impl");
		
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return descripcion;
	}

	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
		System.out.println("setDescripcion");
		
	}

}
