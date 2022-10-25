package clase05;

public class Prueba {
	public static void main(String[]args) {
		GatoDomestico gato = new GatoDomestico("Bigotes", "domicilio", "Miauu", 43, "Te ha traido un animal muerto");
		gato.cazar();
		gato.comer();
		gato.dormir();
		gato.caer();
		gato.hacerRuido();
	}

}
