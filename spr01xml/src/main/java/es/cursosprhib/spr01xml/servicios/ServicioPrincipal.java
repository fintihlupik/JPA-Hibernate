package es.cursosprhib.spr01xml.servicios;

public class ServicioPrincipal {
	
	private String descripcion;
	private Servicio01 s01;
	
	public void metodoServicio() {
		System.out.println("metodoServicio() de ServicioPrincipal");
		s01.m1();
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Servicio01 getS01() {
		return s01;
	}

	public void setS01(Servicio01 s01) {
		this.s01 = s01;
	}

	@Override
	public String toString() {
		return "ServicioPrincipal [descripcion=" + descripcion + ", s01=" + s01 + "]";
	}
	
	
	
	
	

}
