package clase07;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Ejercicios {
	
	public static void main(String[]args) {
		
		//Ejercicio 1
		
		/*Crear un mapa con llaves String y valores String. Cargar el mapa con el nombre de 5 paises como llave 
		 * y sus capitales correspondientes como valor. Imprimir el nombre de los 5 paises y sus capitales,
		 *  obteniendo los datos desde el mapa.
		 * */
		 
		SortedMap<String, String> paisesCapitales = new TreeMap<>();
		paisesCapitales.put("Argentina", "Buenos Aires");
		paisesCapitales.put("Paraguay", "Asuncion");
		paisesCapitales.put("Brasil", "Brasilia");
		paisesCapitales.put("Uruguay", "Montevideo");
		paisesCapitales.put("Chile", "Santiago");
		/*
		for (String pais : paisesCapitales.keySet()) {
			System.out.println(pais+" ==> capital: "+paisesCapitales.get(pais));
		}
		*/
		
		/*Una forma de representar los colores en software es mediante la cantidad de rojo, verde y azul que lo componen 
		 * (RGB) con números que van de 0 a 255 para cada componente. Crear un mapa con llaves String y valores int[].
		 * Cargar el color “rojo” (255, 0, 0), “verde” (0, 255, 0), “azul” (0, 0, 255) y dos colores personalizados
		 * utilizando su nombre como llave y las componentes como valor.
		 * Googlear “color picker” para acceder a una herramienta para elegir colores ;).
		 */
		
		//Ejercicio 2
		
		Map<String, int[]> paletaRGB = new HashMap<>();
		int[][] paleta = {{255, 0, 0}, {0, 255, 0}, {0, 0, 255}, {0, 0, 0}, {255, 255, 255}};
		paletaRGB.put("rojo", paleta[0]);
		paletaRGB.put("verde",paleta[1]);
		paletaRGB.put("azul",paleta[2]);
		paletaRGB.put("negro",paleta[3]);
		paletaRGB.put("blanco",paleta[4]);
		/*
		System.out.println("Colores RGB Basicos");
		for (String color : paletaRGB.keySet()) {
			System.out.println(color+": ("+paletaRGB.get(color)[0]+", "+paletaRGB.get(color)[1]+", "+paletaRGB.get(color)[2]+")");
		}
		*/
		
		//Ejercicio 3
		
		/*Crear un mapa con llaves String y valores enteros. Solicitaremos al usuario que cargue 
		 * apellidos (llave) y calificaciones (valor) hasta que se ingrese el string “finalizar” como apellido.
		 *  Si el apellido que se quiere cargar ya existe en el mapa, esta entrada debe ser eliminada.
		 *  Al finalizar la carga del mapa, imprimir la lista de alumnos y sus calificaciones en orden alfabético.
		 */
		
		/*
		SortedMap<String, Integer> calificaciones = new TreeMap<>();
		Scanner teclado = new Scanner(System.in);
		String apellido = "";
		String opcion = "";
		System.out.println("A continuacion ingrese el apellido del alumno seguido de su calificacion");
		while (apellido.equalsIgnoreCase("finalizar")==false) {
			System.out.println("Ingrese Apellido (finalizar para dejar de ingresar)");
			apellido = teclado.nextLine();
			if (apellido.equalsIgnoreCase("finalizar")==false) {
				if (calificaciones.containsKey(apellido)==false){
					System.out.println("Calificacion (numero entero)");
					Integer nota = teclado.nextInt();
					teclado.nextLine();
					calificaciones.put(apellido, nota);
				} else {
					System.out.println("El apellido ingresado ya se encuentra registrado. Desea reemplazarlo? [si/no]");
					opcion = teclado.nextLine();
					opcion.toLowerCase();
					if (opcion.equalsIgnoreCase("si") || opcion.equalsIgnoreCase("s")) {
						System.out.println("Calificacion (numero entero)");
						Integer nota = teclado.nextInt();
						teclado.nextLine();
						calificaciones.put(apellido, nota);
					}
				}
			}
					
			
		}
		teclado.close();
		System.out.println("Calificaciones de los estudiantes");
		for (String estudiante : calificaciones.keySet()) {
			System.out.println(estudiante+": "+calificaciones.get(estudiante));
		}
		*/
		
		//Ejercicio 4
		
		/*Queremos almacenar usuarios y contraseñas de un modo seguro, para lo cual programaremos una función
		 * que modifique la contraseña con un algoritmo que solo nosotros conocemos y la almacene en un mapa.
		 * La contraseña será un número entero de 5 cifras. Nuestro algoritmo tomará la contraseña y
		 * le sumará la cantidad de letras del usuario multiplicada por 5. Solicitar al usuario el ingreso
		 * de tres pares usuario-contraseña y almacenarlos en un mapa. Imprimir los contenidos del mapa luego de esto.
		*/
		
		Map<String, Integer> usuarios = new HashMap<>();
		Scanner teclado = new Scanner(System.in);
		
		//Modifico la consigna y va a cargar usuarios hasta que ingrese 0 para salir
		System.out.println("Registrar usuarios en el sistema (0 para finalizar)");
		
		//inicializo user para la condicion del ciclo en cualquier valor diferente a 0 y enteros para pin e intentos fallidos
		String user = "";
		Integer pin = 0;
		int intentos = 0;
		String opcion = "si";
		//Ciclo de registro quepara si ingresa 0
		System.out.println("Registro de usuarios");
		do {
			System.out.println("Ingrese nombre de usuario: (0 para salir)");
			user = teclado.nextLine();
			if (usuarios.containsKey(hashUser(user))) {
				System.out.println("El usuario ya se encuentra registrado");
				System.out.println("Desea reemplazar el PIN? [si/no]");
				opcion = teclado.nextLine();
				if (opcion.equalsIgnoreCase("si")) {
					System.out.println("Validacion de PIN requerida");
					while (checkPin(pin) && intentos<3 && opcion.equalsIgnoreCase("si")) {
						System.out.println("Ingrese el PIN anterior");
						try {
							pin = teclado.nextInt();
						} catch(InputMismatchException e) {
							System.out.println("ERROR SOLO INGRESAR NUMEROS");
						}
						if(usuarios.get(hashUser(user)) == hashPin(pin, user)) {
							System.out.println("Ingrese el NUEVO PIN (Solo numeros y mas de cinco digitos)");
							try {
								pin = teclado.nextInt();
							} catch(InputMismatchException e) {
								System.out.println("ERROR SOLO INGRESAR NUMEROS");
							}
							if (checkPin(pin) == false) {
								pin = hashPin(pin,user);
								usuarios.replace(hashUser(user), pin);
							} else {
								System.out.println("PIN muy corto. Ingrese nuevamente");
							}
						} else {
							System.out.println("PIN INCORRECTO. Intente nuevamente");
							intentos++;
							pin = 0;
							System.out.println("Intentos restantes: "+(3-intentos));
						}
					}
				}
				
			} else {
				while (checkPin(pin)) {
					System.out.println("Ingrese el PIN");
					try {
						pin = teclado.nextInt();
					} catch(InputMismatchException e) {
						System.out.println("ERROR SOLO INGRESAR NUMEROS");
					}
					System.out.println("PIN muy corto. Ingrese nuevamente");
				} 
				pin = hashPin(pin,user);
				usuarios.replace(hashUser(user), pin);
				
			}
			
			
			
		} while(user.equals("0")== false && intentos<3);
		
		
		if (intentos<3) {
			intentos = 0;
			while (intentos < 3) {
				System.out.println("***LOG IN***");
				System.out.println("Ingrese usuario");
				user = teclado.nextLine();
				System.out.println("Ingresar PIN");
				pin = teclado.nextInt();
				if (usuarios.containsKey(hashUser(user)) == false) {
					System.out.println("USUARIO INEXISTENTE");
					intentos ++;
					System.out.println("Intentos restantes "+(3-intentos));
				} else if (usuarios.get(hashUser(user)) != hashPin(pin, user)) {
					System.out.println("CLAVE INCORRECTA");
					intentos ++;
					System.out.println("Intentos restantes "+(3-intentos));
				} else {
					System.out.println("LOGIN EXITOSO");
					intentos = 3;
				}
			}
			
		}
		
	}
	
	
	public static Integer hashPin (Integer p, String us) {
		Integer pass = p + (us.length()*5);
		return pass;
	}
	
	public static String hashUser (String us) {
		String usuario= "";
		char[]u = us.toCharArray();
		for (int i=0; i<us.length(); i++) {		
			u[i] += 1;
			usuario += u[i];
		}
		return usuario;
	}
	
	public static boolean checkPin (Integer pass) {
		if (pass.toString().length()<5)
			return true;
		else 
			return false;
	}
}
