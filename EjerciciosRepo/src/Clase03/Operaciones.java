package Clase03;
import java.util.Scanner;
public class Operaciones {
	/* Implementar la clase Operaciones. Se deben escribir los métodos para:
	 * Cargar 2 valores enteros
	 * Calcular e imprimir la suma
	 * Calcular e imprimir la resta
	 * Calcular e imprimir la multiplicacion
	 * Calcular e imprimir la división
	 */
	public static Scanner teclado = new Scanner(System.in);
	private int valor1, valor2;
	
	public void inicializar() {
		System.out.println("Ingrese el primer número:");
		valor1 = teclado.nextInt();
		System.out.println("Ingrese el segundo número:");
		valor2 = teclado.nextInt();
	}
	public void sumar() {
		int suma = valor1 + valor2;
		System.out.println("El resultado de "+valor1+" + "+valor2+" es: "+suma);
	}
	public void restar() {
		int resta = valor1 - valor2;
		System.out.println("El resultado de "+valor1+" - "+valor2+" es: "+resta);
	}
	public void dividir() {
		int division = valor1 / valor2;
		System.out.println("El resultado de "+valor1+" / "+valor2+" es: "+division);
	}
	public void multiplicar() {
		int producto = valor1 * valor2;
		System.out.println("El resultado de "+valor1+" x "+valor2+" es: "+producto);
	}
	public static void main(String[]args) {
		Operaciones calcular = new Operaciones();
		System.out.println("*==============================================*");
		System.out.println("|**** Bienvenido a la calculadora inicial *****|");
		System.out.println("*==============================================*");
		System.out.println("");
		System.out.println("Las operaciones disponibles son::");
		System.out.println("");
		System.out.println("1_ SUMA");
		System.out.println("2_ RESTA");
		System.out.println("3_ DIVISION");
		System.out.println("4_ MULTIPLICACION");
		System.out.println("0_ SALIR");
		System.out.println("");
		System.out.println("Elija una opcion::");
		int menu = teclado.nextInt();
		while (menu > 4 || menu < 0) {
			System.out.println("OPCION INCORRECTA! Ingrese una opcion correcta: ");
			menu = teclado.nextInt();
		}
		System.out.println("");
		if (menu!=0) {
			calcular.inicializar();
			System.out.println("");
		}
		switch (menu) {
		case 1:
			calcular.sumar();
			break;
		case 2:
			calcular.restar();
			break;
		case 3:
			calcular.dividir();
			break;
		case 4:
			calcular.multiplicar();
			break;
		default:
			System.out.println("Ha elegido salir :(");
		}
		System.out.println("");
		System.out.println("*=================================================*");
		System.out.println("|**** Muchas gracias por usar mi programa :) *****|");
		System.out.println("*=================================================*");
	}
}
