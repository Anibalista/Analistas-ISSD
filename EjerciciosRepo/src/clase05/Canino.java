package clase05;

public class Canino extends Animal {

	protected String orden;
	
	public Canino(String nombre, String locate, String ruido, double sizeCm, String orden) {
		super(nombre, locate, ruido, sizeCm);
		this.orden = orden;
	}
	


	public void setOrden(String orden) {
		this.orden = orden;
	}


	public void darOrden() {
		System.out.println(orden);
	}

}
