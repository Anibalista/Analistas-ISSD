package Clase03;
import java.util.Scanner;

public class Empleadooo {
	
	/*
	 * Confeccionar una clase que represente un empleado. Definir como atributos su nombre y su sueldo.
	 * En el constructor cargar los atributos y luego en otro método imprimir sus datos 
	 * y por último uno que imprima un mensaje si debe pagar impuestos (si el sueldo supera a 3000)
	 */
	private Scanner teclado;
	private String nombre;
	private int sueldo;
	
	public Empleadooo() {
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado: ");
		nombre = teclado.nextLine();
		System.out.print("Ingrese el sueldo en pesos: ");
		sueldo = teclado.nextInt();
	}
	public void imprimir() {
		System.out.println("Nombre del empleado: "+nombre);
		System.out.println("sueldo mensual : $"+sueldo);
	}
	public void pagarImpuestos() {
		if (sueldo>3000) {
			System.out.println("Debe pagar impuestos");
		} else {
			System.out.println("No paga impuestos");
		}
	}
	public static void main(String[]args) {
		Empleadooo empleado = new Empleadooo();
		empleado.imprimir();
		empleado.pagarImpuestos();
	}
}
