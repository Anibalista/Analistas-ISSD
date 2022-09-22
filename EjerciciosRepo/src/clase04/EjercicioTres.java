package clase04;
import java.util.Scanner;

public class EjercicioTres {
	private Scanner teclado;
	private int[] vector = new int[5];
	
	public EjercicioTres() {
		teclado = new Scanner(System.in);
		System.out.println("A continuacion ingrese 5 valores enteros por teclado");
		for (int i=0; i<vector.length; i++) {
			System.out.println("Ingrese el valor n° "+(i+1));
			vector[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
	public void getOrden() {
		int cantOrdenados = 1;
		for (int i=1; i<vector.length; i++) {
			if (vector[i]>vector[i-1]) {
				cantOrdenados++;
			}
		}
		if (cantOrdenados==vector.length) {
			System.out.println("Vector Ordenado de Menor a Mayor");
		} else if (cantOrdenados==1) {
			System.out.println("Vector Ordenado de Mayor a Menor");
		} else {
			System.out.println("El Vector NO esta Ordenado ");
		}
	}
	
	public void setOrdenMenor() {
		for (int i=0; i<vector.length-1; i++) {
			for (int j=0; j<vector.length-i-1; j++) {
				int aux;
				if (vector[j]>vector[j+1]) {
					aux = vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=aux;
				}
			}
		}
	}
	
	public void setOrdenMayor() {
		for (int i=0; i<vector.length-1; i++) {
			for (int j=0; j<vector.length-i-1; j++) {
				int aux;
				if (vector[j]<vector[j+1]) {
					aux = vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=aux;
				}
			}
		}
	}

	public void imprimir() {
		System.out.print("Vector: [ ");
		for (int i=0; i<vector.length; i++) {
			if (i==vector.length-1) {
				System.out.print(vector[i]+" ]");
			} else {
				System.out.print(vector[i]+", ");
			}
		}
	}
	
	public static void main(String[]args) {
		System.out.println("*==================================================*");
		System.out.println("|**** Bienvenido al ejercicio de Ordenamiento *****|");
		System.out.println("*==================================================*");
		                       EjercicioTres ejerDeOrden = new EjercicioTres();
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		                          ejerDeOrden.imprimir();
		System.out.println("");
		                          ejerDeOrden.getOrden();
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
		                          ejerDeOrden.setOrdenMenor();
		System.out.println("");
		                          ejerDeOrden.imprimir();
		System.out.println("");
		                          ejerDeOrden.getOrden();
		System.out.println("");
		System.out.println("==================================================");
		System.out.println("");
                                  ejerDeOrden.setOrdenMayor();
        System.out.println("");
                                  ejerDeOrden.imprimir();
        System.out.println("");
                                  ejerDeOrden.getOrden();
        System.out.println("");
        System.out.println("*=================================================*");
        System.out.println("|**** Muchas gracias por usar mi programa :) *****|");
        System.out.println("*=================================================*");
	}

}
