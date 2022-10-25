package clase07;

public class PruebaArrays {
	public static void main(String[]args) {
		
		System.out.println("Experimento: Como hashear un String");
		
		String prueba = "aaaaaabbbbbb";
		char[] cadenaChar = prueba.toCharArray();
		String evidencia = "";
		System.out.println("Prueba original ==> "+prueba);
		System.out.println("");
		System.out.print("Prueba en cadena de caracteres ==> ");
		for (int i=0; i<cadenaChar.length; i++) {
			System.out.print(cadenaChar[i]);
		}
		System.out.println("");
		
		System.out.print("Cadena de caracteres hasheada ==> ");
		for (int i=0; i<cadenaChar.length; i++) {
			cadenaChar[i] += 1;
			System.out.print(cadenaChar[i]);
			evidencia += cadenaChar[i];
		}
		System.out.println("");
				
		System.out.println("Cadena de caracteres hasheada integrada a otro String ==> "+evidencia);
	}
	
}
