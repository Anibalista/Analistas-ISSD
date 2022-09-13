package Clase03;
import java.util.Scanner;
public class OperacionesBasicas {
	/* Implementar la clase Operaciones. Se deben escribir los métodos para:
	 * Cargar 2 valores enteros
	 * Calcular e imprimir la suma
	 * Calcular e imprimir la resta
	 * Calcular e imprimir la multiplicacion
	 * Calcular e imprimir la división
	 */
	
	private Scanner teclado;
	private int valor1, valor2;
	public static int menu;
	
	public OperacionesBasicas() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese una opcion del 0 al 4:");
		menu = teclado.nextInt();
		while (menu<0 || menu>4) {
			System.out.println("OPCION INCORRECTA!");
			System.out.println("");
			System.out.print("Ingrese una opcion valida (del 0 al 4): ");
			menu = teclado.nextInt();
		}
		if (menu!=0) {
			System.out.println("Ingrese el primer valor:");
			valor1 = teclado.nextInt();
			System.out.println("Ingrese el segundo valor");
			valor2 = teclado.nextInt();
		}
	}
	
	public void sumar() {
		int suma = valor1 + valor2;		
		System.out.println("El resultado de "+valor1+" + "+valor2+" es: "+suma);
	}
	
	public void restar() {
		int resta = valor1 - valor2;
		System.out.println("El resultado de "+valor1+" - "+valor2+" es: "+resta);
	}
	
	public void multiplicar() {
		int producto = valor1 * valor2;
		System.out.println("El resultado de "+valor1+" x "+valor2+" es: "+producto);
	}
	
	public void dividir() {
		int division = valor1 / valor2;	
		System.out.println("El resultado de "+valor1+" / "+valor2+" es: "+division);
	}
	
	public static void main(String[]args) {
		System.out.println("*==============================================*");
		System.out.println("|**** Bienvenido a la calculadora inicial *****|");
		System.out.println("*==============================================*");
		System.out.println("");
		System.out.println("Las operaciones disponibles son::");
		System.out.println("");
		System.out.println("1_ SUMA");
		System.out.println("2_ RESTA");
		System.out.println("3_ MULTIPLICACION");
		System.out.println("4_ DIVISION");
		System.out.println("0_ SALIR");
		System.out.println("");
		System.out.println("Elija una opcion::");
		OperacionesBasicas operaciones = new OperacionesBasicas();
		System.out.println("");
		switch (menu) {
		case 1:
			operaciones.sumar();
			break;
		case 2:
			operaciones.restar();
			break;
		case 3:
			operaciones.multiplicar();
			break;
		case 4:
			operaciones.dividir();
			break;
		default:
			System.out.println("Usted selecciono salir :(");
		}
		System.out.println("");
		System.out.println("*=================================================*");
		System.out.println("|**** Muchas gracias por usar mi programa :) *****|");
		System.out.println("*=================================================*");
	}
}
