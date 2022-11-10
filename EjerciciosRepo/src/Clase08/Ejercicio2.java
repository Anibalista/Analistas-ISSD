package Clase08;
import java.io.*;
import java.util.Scanner;

public class Ejercicio2 {
//Clase que abre y muestra cualquier archivo en la pc que el usuario ingrese
	
	public static void main(String[]args) throws IOException {
		Scanner teclado = new Scanner(System.in);
		int ind;
		System.out.println("Escriba la ruta del archivo a leer");
		String ruta = teclado.nextLine();
		teclado.close();
		FileInputStream archivo;
		try {
			archivo = new FileInputStream(ruta);
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR: Ruta no encontrada");
			return;
		}
		do {
			ind = archivo.read();
			if (ind != -1)
				System.out.print((char) ind);
		} while (ind != -1);
		archivo.close();
		
	}
}
