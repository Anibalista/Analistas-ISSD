package Clase02;

import java.util.Scanner;

public class Ejercitaciones02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("==========================================");
			System.out.println("|| Bienvenido a la clase 2 Ejercicios 2 ||");
			System.out.println("==========================================");
			System.out.println();
			System.out.println("Las opciones son: ");
			System.out.println();
			System.out.println("1_ Suma valores ingresados por teclado hasta ingresar 9999 que termina la carga.");
			System.out.println("   Informar si dicho valor es igual, mayor o menor a cero");
			System.out.println("2_ Sistema bancario donde se ingresan numeros de cuentas y saldos de clientes");
			System.out.println("   La carga finaliza al ingresar un valor negativo. Se pide:");
			System.out.println("   a_ Informar estado de cada cuenta (Acreedor > 0, Deudor < 0 y Nulo = 0)");
			System.out.println("   b_ Suma total de los acreedores");
			System.out.println("0_ SALIR.");
			System.out.println();
			System.out.print("Ingrese una opcion: ");
			 menu = teclado.nextInt();
			while (menu>2 || menu<0) {
				System.out.println();
				System.out.println("Opcion incorrecta!! Ingrese nuevamente: ");
				menu = teclado.nextInt();
		    }
			if (menu==1) {
				int valor = 0;
				int suma = 0;
				do {
					System.out.println("");
					System.out.println("Ingrese un valor: ");
					valor = teclado.nextInt();
					if (valor!=9999) {
						suma += valor;
					}
				} while (valor!=9999);
				System.out.println("La suma de todos los valores da como resultado"+suma);
				System.out.println("");
				if (suma>0) {
					System.out.println("El resultado es mayor a cero");
				} else if (suma<0) {
					System.out.println("El resultado es menor a cero");
				} else {
					System.out.println("El resultado es cero");
				}
			} else {
				int cuenta = 0;
				int acreedores = 0;
				int monto = 0;
				do {
					System.out.print("Ingrese un número de cuenta (nagativo para finalizar): ");
					cuenta = teclado.nextInt();
					System.out.println("");
					if (cuenta>=0) {
						System.out.print("Ingrese el monto de la cuenta: ");
						monto = teclado.nextInt();
						System.out.println("");
						System.out.print("Estado de la cuenta: ");
					}
					if (monto>0) {
						acreedores += monto;
						System.out.println("Acreedor");
					} else if (monto<0) {
						System.out.println("Deudor");
					} else {
						System.out.println("Nulo");
					}
				} while (cuenta>=0);
				System.out.println("");
				System.out.print("La suma total del monto de los acreedores es $"+acreedores);
			}
			System.out.println();
		} while (menu!=0);
		teclado.close();
		System.out.println("");
		System.out.println("***************************************");
		System.out.println("**Gracias por utilizar mi programa :)**");
		System.out.println("***************************************");

	}

}
