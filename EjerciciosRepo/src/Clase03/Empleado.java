package Clase03;
import java.util.Scanner;
public class Empleado {
	private Scanner teclado;
	int sueldo;
	String nombre;
	
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado: ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese el sueldo en pesos: ");
		sueldo = teclado.nextInt();
	}
	public void imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Sueldo: $"+sueldo);
	}
	public void pagarImpuestos() {
		if (sueldo > 3000) {
			System.out.println(nombre+" Debe pagar impuestos!");
	      }
	}
	public static void main(String[] args) {
			/*
			 *Confeccionar una clase que represente un empleado. Definir como atributos su nombre y sueldo.
			 *Confeccionar los métodos para la carga, otro para imprimir sus datos y por último
			 *uno 
			 */	
		Empleado empleado1 = new Empleado();
		empleado1.inicializar();
		empleado1.imprimir();
		empleado1.pagarImpuestos();
		
	}
}
