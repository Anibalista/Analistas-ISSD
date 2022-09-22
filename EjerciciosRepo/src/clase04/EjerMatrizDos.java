package clase04;
import java.util.Scanner;
/*
 *Cargar una matriz por columnas y luego imprimir la matriz
 *Haré 2 constructores: uno con enteros y otro con strings
 *voy a medir los ingresos en digitos para imprimir la matriz lo mas derecha posible
 */
public class EjerMatrizDos {
	//creo teclado estatico para multiples constructores y ambas matrices
	private static Scanner teclado;
	private int[][] matrixInt = new int[2][5];
	private String[][] matrixString;
	
	//Constructor con enteros
	public EjerMatrizDos() {
		System.out.println("Carga de componentes (Solo permitidos valores de 1 digito): ");
		System.out.println();
		for(int i=0,j=0;j<matrixInt[i].length; j++) {
			for (i=0; i<matrixInt.length; i++) {
				System.out.println("Ingrese un valor entero de 1 solo digito en la columna "+(j+1)+", fila "+(i+1));
				matrixInt[i][j] = teclado.nextInt();
				while(matrixInt[i][j]<0 || matrixInt[i][j]>9) {
					System.out.println("ERROR! Solo se permiten valores de 1 digito (del 0 al 9). Ingrese nuevamente:");
					matrixInt[i][j] = teclado.nextInt();
				}
			}
			i=0;
		}
		System.out.println();
	}
	
	//Constructor con String ingresando la cantidad de filas y columnas
	public EjerMatrizDos(int fil, int col) {
		matrixString = new String[fil][col];
		System.out.println();
		teclado.nextLine();
		System.out.println("Carga de componentes: ");
		for(int i=0,j=0;j<matrixString[i].length; j++) {
			for (i=0; i<matrixString.length; i++) {
				System.out.println("Ingrese una palabra en la columna "+(j+1)+", fila "+(i+1));
				matrixString[i][j] = teclado.nextLine();
			}
			i=0;
		}
		System.out.println();
	}
	
	//Método imprimir para enteros
	public void imprimir() {
		System.out.println();
		System.out.println("Matriz de enteros: ");
		for(int i=0; i<matrixInt.length;i++) {
			System.out.print("| ");
			for(int j=0; j<matrixInt[i].length;j++) {
				System.out.print(matrixInt[i][j]+" ");
			}
			System.out.println("|");
		}
	}
	
	//Método para detectar la palabra mas larga y retornar el tamaño
	public int getLongestWord() {
		int masLarga = matrixString[0][0].length();
		for(int i=0; i<matrixString.length; i++) {
			for(int j=0; j<matrixString.length; j++) {
				if(masLarga<matrixString[i][j].length()) {
					masLarga = matrixString[i][j].length();
				}
			}
		}
		return masLarga;
	}
	
	//Metodo para imprimir vector de Strings alineados a la derecha
	public void imprimirString(int largo) {
		System.out.println();
		System.out.println("Matriz de palabras: ");
		for (int i=0; i<matrixString.length; i++) {
			System.out.print("| ");
			for (int j=0; j<matrixString[i].length; j++) {
				int palabra = largo+3-matrixString[i][j].length();
				while(palabra!=0) {
					System.out.print(" ");
					palabra--;
				}
				System.out.print(matrixString[i][j]);
				if(j==matrixString[i].length-1) {
					System.out.println(" |");
				} else {
					System.out.print(", ");
				}
			}
		}
	}
	
	//Abrimos Main
	public static void main(String[]args) {
		
		//inicializamos teclado
		teclado = new Scanner(System.in);
		
		//Creamos objeto matriz de enteros
		EjerMatrizDos matrixNum1 = new EjerMatrizDos();
		
		//Imprimimos matriz de enteros
		matrixNum1.imprimir();
		
		//Creamos objeto matriz de palabras
		EjerMatrizDos matrixString1 = new EjerMatrizDos(2,5);
		teclado.close();
		
		//Controlo e imprimo matriz de palabras alineadas a la derecha
		matrixString1.imprimirString(matrixString1.getLongestWord());
	}

}
