package clase04;
import java.util.Scanner;
/*
 * Crear matriz de n * m (cargar n y m por teclado).
 * Intercambiar laprimera fila por la segunda.
 * Imprimir la matriz
 * Imprimir los cuatro valores que se encuentran en los vertices
 */
public class EjerMatrizTres {
	//Creo atributo matriz
	private int[][] matrixInt;
	
	//Constructor que recibe n y m (Los otros valores los genera random del 1 al 9999)
	public EjerMatrizTres(int fil, int col) {
		matrixInt = new int[fil][col];
		for(int i=0; i<matrixInt.length; i++) {
			for(int j=0; j<matrixInt[i].length; j++) {
				matrixInt[i][j] = (int)(1+Math.random()*9998);
			}
		}
		System.out.println();
	}
	
	//Imprimo alineando los caracteres a la derecha en 5 espacios
	public void imprimir() {
		String digitos;
		for(int i=0; i<matrixInt.length; i++) {
			System.out.print("|");
			for(int j=0; j<matrixInt[i].length; j++) {
				digitos = Integer.toString(matrixInt[i][j]);
				int largo = 4 - digitos.length();
				while(largo!=0) {
					System.out.print(" ");
					largo--;
				}
				System.out.print(matrixInt[i][j]);
				if (j==matrixInt[i].length-1) {
					System.out.println("|");
				} else {
					System.out.print(", ");
				}
			}
		}
	}
	
	//Intercambio de filas
	public void setRowSwap() {
		for(int j=0; j<matrixInt[0].length; j++) {
			int aux = matrixInt[0][j];
			matrixInt[0][j] = matrixInt[1][j];
			matrixInt[1][j] = aux;
		}
	}
	
	//Imprimo vértices
	public void getVertices() {
		System.out.print("Vertices: ");
		for(int i=0; i<matrixInt.length; i++) {
			for(int j=0; j<matrixInt[i].length; j++) {
				if(j==matrixInt[i].length-1 && i==matrixInt.length-1) {
					System.out.println(matrixInt[i][j]+".");
				} else {
					System.out.print(matrixInt[i][j]+", ");
				}
				j += matrixInt[i].length-2;
			}
			i += matrixInt.length-2;
		}
	}
	
	//Metodo main
	public static void main(String[]args) {
		//Inicio teclado y pido los valores de n y m
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese cantidad de filas");
		int n = teclado.nextInt();
		System.out.println("Ingrese cantidad de columnas");
		int m = teclado.nextInt();
		teclado.close();
		
		//Inicializo objetos (carga automática)
		EjerMatrizTres matrix1 = new EjerMatrizTres(n,m);
		System.out.println("");
		System.out.println("**********************************************************");
		System.out.println("");
		
		//Imprimo
		System.out.println("Matriz inicial: ");
		matrix1.imprimir();
		System.out.println("");
		System.out.println("**********************************************************");
		System.out.println("");
		
		//Cambio filas
		matrix1.setRowSwap();
		//Imprimo
		System.out.println("Matriz cambiada:");
		matrix1.imprimir();
		System.out.println("");
		System.out.println("**********************************************************");
		System.out.println("");
		
		//Imprimir vertices
		matrix1.getVertices();
		
	}

}
