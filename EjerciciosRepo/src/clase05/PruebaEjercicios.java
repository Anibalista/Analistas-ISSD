package clase05;
//import java.util.Scanner;

public class PruebaEjercicios {
	public static void main(String[]args) {
		
		GatoDomestico gato = new GatoDomestico("Pelusa", "Domicilio", "Miauu", 23, "Te trajo un animal muerto");
		Perro perro = new Perro("Sultan", "Patio", "Woof", 102, "Quieto!", "Dogo Argentino");
		Lobo lobo = new Lobo("Alfa", "Bosque Sur", "Auuu!", 115, "Fuera!");
		Tigre tigre = new Tigre("Tigre de Bengala", "Bosques Nevados", "GRRRR", 186, "Ha cazado un reno");
		Leon leon = new Leon("Simba", "Sabana", "Grrrr", 193, "Cazó una cebra");
		
		leon.comer();
		tigre.hacerRuido();
		gato.vacunar();
		gato.cazar();
		tigre.cazar();
		leon.cazar();
		
		lobo.hacerRuido();
		perro.hacerRuido();
		perro.darOrden();
		perro.sacarPasear();
		lobo.dormir();
	}
}
