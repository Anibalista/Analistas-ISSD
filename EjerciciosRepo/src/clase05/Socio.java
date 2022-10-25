package clase05;
import java.util.Scanner;

public class Socio {
	private String nombre;
	private int antiguedad;
	private Scanner teclado;
	
	public Socio() {
		System.out.println("Ingrese el nombre del socio: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese la antiguedad del socio en años: ");
		antiguedad = teclado.nextInt();
	}

	public String getNombre() {
		return nombre;
	}

	public int getAntiguedad() {
		return antiguedad;
	}
	
	
}
