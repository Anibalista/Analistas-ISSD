package clase05;

public class GatoDomestico extends Felino{

	
	
	public GatoDomestico(String nombre, String locate, String ruido, double sizeCm, String mensajeDeCaza) {
		super(nombre, locate, ruido, sizeCm, mensajeDeCaza);
	}

	public void vacunar() {
		System.out.println("Tu mascota fue vacunada");
	}
	
}
