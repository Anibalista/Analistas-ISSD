package clase05;

public class Felino extends Animal {
	
	protected String mensajeDeCaza;

	public Felino(String nombre, String locate, String ruido, double sizeCm, String mensajeDeCaza) {
		super(nombre, locate, ruido, sizeCm);
		this.mensajeDeCaza = mensajeDeCaza;
	}
	

	
	public void setMensajeDeCaza(String mensajeDeCaza) {
		this.mensajeDeCaza = mensajeDeCaza;
	}


	public void cazar() {
		System.out.println(mensajeDeCaza);
	}

}
