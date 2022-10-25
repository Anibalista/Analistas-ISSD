package clase05;

public class Perro extends Canino {
	
	private String raza;

	public Perro(String nombre, String locate, String ruido, double sizeCm, String orden, String raza) {
		super(nombre, locate, ruido, sizeCm, orden);
		this.raza = raza;
	}
	
	public void vacunar() {
		System.out.println("Tu perro fue vacunado");
	}
	
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void sacarPasear () {
		System.out.println("Mueve la cola de alegría");
	}

	

}
