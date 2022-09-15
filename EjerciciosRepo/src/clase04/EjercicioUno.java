package clase04;
import java.util.Scanner;

public class EjercicioUno {
	
	private Scanner teclado;
	private int[] vectorDe4;
	
	public EjercicioUno() {
		vectorDe4 = new int[4]; 
	}
	
	public void setComponentes() {
		teclado = new Scanner(System.in);
		System.out.println("A continuacion, ingrese 4 numeros enteros: ");
		System.out.println("");
		for(int v=0; v<vectorDe4.length; v++) {
			System.out.println("Ingrese el valor numero "+(v+1)+": ");
			vectorDe4[v] = teclado.nextInt();
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");
	}
	
	public void calcAcumulados() {
		int suma = 0;
		for(int p=0; p<vectorDe4.length; p++) {
			suma += vectorDe4[p];
		}
		System.out.println("");
		System.out.println("Los valores ingresados suman un total de "+suma);
		System.out.println("");
		System.out.println("--------------------------------------------------");
	}
	
	public void getMayoresCincuenta() {
		int cantidad = 0;
		for(int c=0; c<vectorDe4.length; c++) {
			if(vectorDe4[c]>50) {
				cantidad++;
			}
		}
		System.out.println("");
		System.out.println(cantidad+" de los valores ingresados son mayores a 50");
		System.out.println("");
		System.out.println("--------------------------------------------------");
	}
	
	public static void main(String[]ar) {
		EjercicioUno arrVector1 = new EjercicioUno();
		arrVector1.setComponentes();
		arrVector1.calcAcumulados();
		arrVector1.getMayoresCincuenta();
		
	}
}
