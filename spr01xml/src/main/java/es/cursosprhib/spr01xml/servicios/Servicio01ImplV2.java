package es.cursosprhib.spr01xml.servicios;

public class Servicio01ImplV2 implements Servicio01{
	
	private String descripcion;

	@Override
	public void m1() {
		System.out.println("Este metodo lo hace mejor!");
		
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
