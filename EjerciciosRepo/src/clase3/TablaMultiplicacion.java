package clase3;
import java.util.Scanner;

public class TablaMultiplicacion {
	
	public static Scanner teclado;
	public static int valor, cantidad;
	
	public TablaMultiplicacion () {
		System.out.println("Ingrese el número a conocer la tabla de multiplicacion:");
		valor = teclado.nextInt();
	}
	
	public void imprimir() {
		System.out.println("Tabla de mulltiplicar del "+valor);
		System.out.println("");
		int resul = valor;
		for(int i=1; i<=10; i++) {
			resul = valor*i;
			System.out.println(valor+" x "+i+" = "+resul);
		}
	}
	
	public void imprimir(int cantidad) {
		System.out.println("");
		System.out.println("Tabla de mulltiplicar del "+valor);
		int resultado;
		for(int i = 1; i<=cantidad; i++) {
			resultado = valor*i;
			System.out.println(valor+" x "+i+" = "+resultado);
		}
	}
	
	public static void main(String[]ar) {
		teclado = new Scanner(System.in);
		int menu; 

		System.out.println("*==============================================*");
		System.out.println("|**** Tablas de multiplicacion inicial *****|");
		System.out.println("*==============================================*");
		TablaMultiplicacion tabla1 = new TablaMultiplicacion();
		System.out.println("");
		System.out.println("1_ Mostrar 10 resultados");
		System.out.println("2_ Elegir cuantos resultados mostrar");
		System.out.println("0_ Salir");
		System.out.println("");
		System.out.println("Elija una opción:");
		
		menu = teclado.nextInt();
		System.out.println("");
		while (menu<0 || menu>2){
			System.out.println("Opcion Incorrecta. Ingrese una opcion Valida");
			menu = teclado.nextInt();
		}
		
		switch(menu) {
		case 1:
			tabla1.imprimir();
			break;
		case 2:
			System.out.println("Hasta que número quiere multiplicar a "+valor);
			cantidad = teclado.nextInt();
			tabla1.imprimir(cantidad);
			break;
		default:
			System.out.println("Eligio salir :(");
		}
		
		System.out.println("");
		System.out.println("*=================================================*");
		System.out.println("|**** Muchas gracias por usar mi programa :) *****|");
		System.out.println("*=================================================*");
		}

}
