package Clase01;

import java.util.Scanner;

public class Ejercitaciones02 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("***********************************");
		System.out.println("***Menu de ejercicios de clase 1***");
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("Las opciones son las siguientes:");
		System.out.println("1_ Calcular el sueldo sabiendo el pago por hora y las horas trabajadas");
		System.out.println("2_ Calcular el perimetro de un cuadrado cargando un lado");
		System.out.println("3_ Mostrar monto a abonar ingresando cantidad del articulo y el precio del mismo");
		System.out.println("4_ Se ingresan 3 notas. Si el promedio es >=7 mostrar el mensaje promocionado");
		System.out.println("5_ Ingresar un número entero por teclado y mostrar si es positivo, nulo o negativo");
		System.out.println("");
		System.out.print("Ingrese una opcion: ");
		int menu=entrada.nextInt();
		switch (menu) {
		case 1:
			System.out.println("Punto 1");
			System.out.println("");
			System.out.print("Ingrese el pago por hora trabajada: ");
			int pago=entrada.nextInt();
			System.out.print("Ingrese las horas trabajadas: ");
			int horas=entrada.nextInt();
			int sueldo=pago*horas;
			System.out.println("El Sueldo del operario es : "+sueldo);
			System.out.println("");
			System.out.println("-------------------------------------------------------");
			System.out.println("");
			break;
		case 2:
			System.out.println("Punto 2");
			System.out.println("");
			System.out.print("Ingrese el lado del cuadrado: ");
			int lado=entrada.nextInt();
			int perim=lado*4;
			System.out.println("El perímetro del cuadrado es: "+perim);
			System.out.println("");
			System.out.println("-------------------------------------------------------");
			System.out.println("");
			break;
		case 3:
			System.out.println("Punto 3");
			System.out.println("");
			System.out.print("Ingrese el precio del articulo: ");
			int precio=entrada.nextInt();
			System.out.print("Ingrese la cantidadque desea comprar: ");
			int cant=entrada.nextInt();
			int monto=precio*cant;
			System.out.println("Debe abonar $"+monto);
			System.out.println("");
			break;
			
		case 4:
			System.out.println("Punto 4");
			System.out.println("");
			System.out.print("Ingrese la primer nota: ");
			int nota1=entrada.nextInt();
			System.out.print("Ingrese la segunda nota: ");
			int nota2=entrada.nextInt();
			System.out.print("Ingrese la tercer nota: ");
			int nota3=entrada.nextInt();
			int promedio=(nota1+nota2+nota3)/3;
			if (promedio>=7) {
				System.out.println("Alumno promocionado con promedio de "+promedio);
			} else {
				System.out.println("El alumno no promociona. Promedio: "+promedio);
			}
			System.out.println("");
			break;
		case 5:
			System.out.println("Punto 5");
			System.out.println("");
			System.out.print("Ingrese un valor entero por teclado");
			int valor=entrada.nextInt();
			if (valor>0) {
				System.out.println("El número es positivo");
			} else if (valor<0) {
				System.out.println("El número es negativo");
			} else {
				System.out.println("El número es nulo");
			}
			System.out.println("");
			break;
		default:
			System.out.println("OPCION INCORRECTA!");
		}
		entrada.close();
		System.out.println("***************************************");
		System.out.println("**Gracias por utilizar mi programa :)**");
		System.out.println("***************************************");

	}

}
