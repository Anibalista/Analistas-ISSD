package Clase01;

public class Ejercitaciones01 {

	public static void main(String[] args) {
		//1_ Generar un valor aleatorio entre 0 y 1000. Mostrar la cantidad de dígitos que tiene
				System.out.println("Punto 1");
				System.out.println("");
				int valor= (int)(Math.random()*1000);
				System.out.print("El valor generado es "+valor+" y tiene ");
				if (valor>99) {
					System.out.println("3 dígitos");
				} else {
					if (valor>9) {
						System.out.println("2 dígitos");
					} else {
						System.out.println("solo 1 dígito");
					}
				}
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				System.out.println("");
				/*
				 * 2_ Generar 3 valores aleatorios por teclado, calcular su promedio. Mostrar un mensaje si
				 * dicho promedio es mayor o igual a 5.
				 */
				System.out.println("Punto 2");
				System.out.println("");
				int valor1=(int)(Math.random()*10);
				int valor2=(int)(Math.random()*10);
				int valor3=(int)(Math.random()*10);
				System.out.print("Los valores generados son "+valor1+", "+valor2+" y "+valor3);
				double promedio= (double)(valor1+valor2+valor3)/3;
				System.out.println(" y su promedio es "+promedio);
				if (promedio<5) {
					System.out.println("El promedio es menor a 5");
				} else {
					System.out.println("El promedio es mayor o igual a 5");
				}
				System.out.println("");
				System.out.println("---------------------------------------------------------");
				System.out.println("");
				//3_ Generar 3 valores aleatorios comprendidos entre 0 y10. Mostrar el menor
				System.out.println("Punto 3");
				System.out.println("");
				int num1=(int)(Math.random()*10);
				int num2=(int)(Math.random()*10);
				int num3=(int)(Math.random()*10);
				System.out.println("Los valores generados son "+num1+", "+num2+" y "+num3);
				if (num1<num2 && num1<num3) {
					System.out.println("El menor de los tres es "+num1);
				} else  {
					if (num2<num1 && num2<num3) {
						System.out.println("El menor de los tres es "+num2);
					} else {
						System.out.println("El menor de los tres es "+num3);
					}
				}
				System.out.println("");
				System.out.println("***************************************");
				System.out.println("**Gracias por utilizar mi programa :)**");
				System.out.println("***************************************");

	}

}
