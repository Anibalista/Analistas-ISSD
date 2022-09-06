package Clase02;

import java.util.Scanner;

public class Ejercitaciones01 {

	public static void main(String[] args) {
		System.out.println("***********************************");
		System.out.println("***Menu de ejercicios de clase 2***");
		System.out.println("***********************************");
		System.out.println("");
		System.out.println("Las opciones son las siguientes:");
		System.out.println("1_Ingresar un valor aleatorio entre 0 y 1000 y mostrar la cantidad de dígitos");
		System.out.println("2_Se ingresa un conjunto de n alturas de personas. INgresar n por teclado y calcular el promedio ");
		System.out.println("3_ Mostrar los múltiplos de 8 hasta 500. en formato 8 - 16 - etc");
		System.out.println("4_ Programa que al cargar n valores enteros nos diga cuantos son pares y cuantos impares");
		System.out.println("");
		Scanner entrada=new Scanner(System.in);
		System.out.print("Ingrese una opcion: ");
		int menu=entrada.nextInt();
		System.out.println("");
		switch (menu) {
		case 1:
			int valor = (int)(Math.random()*1000);
			System.out.println("Se ha generado el número: "+valor);
			System.out.println("");
			System.out.print("El número "+valor+" tiene");
			int digitos = 0;
			do {
				digitos += 1;
				valor /= 10;
			} while (valor>0);
			System.out.println(digitos+" digitos");
			
			break;
		case 2:
			System.out.print("De cuántas personas cargará la altura? ");
			int n = entrada.nextInt();
			int x, suma;
			x = 0;
			suma = 0;
			while (x<n) {
				System.out.print("Ingrese altura en cm: ");
				int altura = entrada.nextInt();
				suma = suma + altura;
				x++;
			}
			float promedio = (float)suma / n;
			System.out.print("El promedio de alturas entre las "+n+" personas es ");
			System.out.printf("%.1fcm%n2", promedio);
			break;
		case 3:
			System.out.println("Múltiplos de 8:");
			int mul = 8;
			System.out.print(mul);
			mul = mul + 8;
			while (mul<=500) {
				System.out.print(" - "+mul);
				mul = mul + 8;
			}
			break;
		case 4:
			System.out.print("Cuántos números desea cargar? ");
			int k = entrada.nextInt();
			System.out.println("");
			int par = 0;
			int impar = 0;
			for (int i=1; i<=k; i++) {
				System.out.print("Ingrese un número: ");
				int num = entrada.nextInt();
				if (num%2==0) {
					par++;
				} else {
					impar++;
				}
			}
			System.out.println("");
			System.out.println("Usted ha ingresado "+par+" números pares y "+impar+" números impares");
			break;
		default:
			System.out.println("OPCION INCORRECTA!");
		}
		entrada.close();
		System.out.println("");
		System.out.println("***************************************");
		System.out.println("**Gracias por utilizar mi programa :)**");
		System.out.println("***************************************");

	}

}
