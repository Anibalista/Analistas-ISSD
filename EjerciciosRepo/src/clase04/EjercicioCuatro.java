package clase04;
import java.util.Scanner;

public class EjercicioCuatro {
	private Scanner teclado;
	private int[]  vector;
	
	public EjercicioCuatro() {
		teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Cuantos valores desea generar?");
		int columnas = teclado.nextInt();
		vector = new int[columnas];
		for (int i=0; i<vector.length; i++) {
			vector[i]= (int)(1+Math.random()*99);
		}
		teclado.close();
		System.out.println("");
	}
	
	public void getMayor() {
		System.out.println("");
		System.out.print("El valor mayor de su vector es ");
		int mayor = vector[0];
		for (int i=1; i<vector.length; i++) {
			if (vector[i]>mayor) {
				mayor = vector[i];
			}
		}
		System.out.println(mayor);
		System.out.println("");
	}
	
	public void getMenor() {
		System.out.println("");
		System.out.print("El valor menor de su vector es ");
		int menor = vector[0];
		for (int i=1; i<vector.length; i++) {
			if (vector[i]<menor) {
				menor = vector[i];
			}
		}
		System.out.println(menor);
		System.out.println("");
	}

	public void imprimir() {
		System.out.println("");
		System.out.print("Vector: [ ");
		for (int i=0; i<vector.length; i++) {
			if (i==vector.length-1) {
				System.out.print(vector[i]+" ]");
			} else {
				System.out.print(vector[i]+", ");
			}
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void main(String[]args) {
		System.out.println("*==================================================*");
		System.out.println("|**** Bienvenido al ejercicio de Ordenamiento *****|");
		System.out.println("*==================================================*");
		
		EjercicioCuatro vec1 = new EjercicioCuatro();
		
		System.out.println("==================================================");
		
		vec1.imprimir();
		
		System.out.println("==================================================");
		
		vec1.getMayor();
		
		System.out.println("==================================================");
		
		vec1.getMenor();
		
		System.out.println("*=================================================*");
        System.out.println("|**** Muchas gracias por usar mi programa :) *****|");
        System.out.println("*=================================================*");
	}
}
