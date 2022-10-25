package clase06;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ejercicios {

	public static void main(String[]args) { 
		
		//Ejercicio 01
		/*
		String[][] paisesParaAgregar = {{"Argentina","Brasil","Paraguay","Peru"},
				{"Guatemala","Cuba","Nicaragua","Puerto Rico"},
				{"Estados Unidos","Canada","Mexico"},
				{"Alemania","Francia","Italia","Portugal"}};
		List<List<String>> listaDePaises = new ArrayList<>();
		
		for(int i=0; i< paisesParaAgregar.length; i++) {
			listaDePaises.add(Arrays.asList(paisesParaAgregar[i]));
		}
		
		System.out.println(listaDePaises.get(2).get(2));
		*/
		
		//Ejercicio 02
		/*
		List<String> sistemaSolar = new ArrayList<>();
		sistemaSolar.add("Mercurio");
		sistemaSolar.add("Venus");
		sistemaSolar.add("Tierra");
		sistemaSolar.add("Marte");
		sistemaSolar.add("Jupiter");
		sistemaSolar.add("Saturno");
		sistemaSolar.add("Urano");
		sistemaSolar.add("Neptuno");
		sistemaSolar.add("Pluton?");
		
		System.out.println("Planetas del sistema solar: ");
		sistemaSolar.forEach(System.out::println);
		}
		*/
		
		//Ejercicio03
		//Scanner teclado = new Scanner(System.in);
		/*
		List<Auto> autos = new ArrayList<>();
		
		int cantidad;
		System.out.println("Cuantos Autos desea cargar");
		cantidad = teclado.nextInt();
		teclado.nextLine();
		String marca;
		int modelo;
		System.out.println();
		System.out.println("A continuación cargará uno por uno marca y modelo (año) de los autos");
		for(int i=0; i<cantidad; i++) {
			System.out.println();
			System.out.print("Marca: ");
			marca = teclado.nextLine();
			System.out.print("Modelo: ");
			modelo = teclado.nextInt();
			teclado.nextLine();
			Auto auto = new Auto(marca, modelo);
			autos.add(auto);
		}
		System.out.println();
		System.out.println("Los autos ingresados son:");
		for (Auto imprimir : autos) {
			System.out.println(imprimir.getMarca()+", modelo "+imprimir.getModelo());
		}
		*/
		/*
		//Ejercicio 4
		*String[] color = {"Trebol", "Pica", "Diamantes", "Corazones"};
		*String[] numero = {"As","2","3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		
		List<List<Carta>> baraja = new ArrayList<>();
		for (int i=0; i<color.length; i++) {
			List<Carta> lista = new ArrayList<>();
			for (int j=0; j<numero.length; j++) {
				Carta carta = new Carta(color[i], numero[j]);
				lista.add(carta);
			} baraja.add(lista);
		}
		
		System.out.println();
		System.out.println("Las cartas son:");
		for (List<Carta> pa : baraja) {
			for (Carta numer : pa) {
				System.out.println(numer.getNumero()+" de "+numer.getPalo());
			}
		}
		*/
		/*
		String[] palo = {"Espadas", "Oro", "Copas", "Basto"};
		String[] num = {"1","2","3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		String[] nume = {"1","2","3", "4", "5", "6", "7", "10", "11", "12"};
		//Ejercicio 5 y 6
		
		Mazo mazo = new Mazo(color, numero);
		Mazo barajaEsp = new Mazo(palo, num);
		Mazo mazoTruco = new Mazo(palo, nume);
		
		int menu;
		do {
			System.out.println("Bienvenido al juego de cartas");
			System.out.println();
			System.out.println("Los mazos disponibles son:");
			System.out.println("1_BARAJA INGLESA");
			System.out.println("2_ BARAJA ESPAÑOLA");
			System.out.println("3_ BARAJA ESPAÑOLA sin 8,9 (Truco)");
			System.out.println("0_SALIR");
			System.out.println();
			System.out.println("Elija una opcion: ");
			menu = teclado.nextInt();
			teclado.nextLine();
			while (menu<0 && menu>4) {
				System.out.println("OPCION INCORRECTA!! Vuelva a ingresar");
				menu = teclado.nextInt();
				teclado.nextLine();
			}
			if (menu!=0) {
				System.out.println();
				System.out.println("Las opciones con ese mazo son: ");
				System.out.println("1_SACAR UNA CARTA AL AZAR");
				System.out.println("2_ REPARTIR UNA MANO");
				System.out.println("3_ MEZCLAR");
				System.out.println("0_SALIR");
				System.out.println();
				System.out.println("Elija una opcion: ");
				int menuB = teclado.nextInt();
				teclado.nextLine();
				while (menuB<0 && menuB>4) {
					System.out.println("OPCION INCORRECTA!! Vuelva a ingresar");
					menuB = teclado.nextInt();
					teclado.nextLine();
				}
			
				
				if (menuB!=0) {
					switch (menuB){
					case 1:
						System.out.print("Su carta es el ");
						switch (menu) {
						case 1:
							Carta inglesaAzar = mazo.cartaAlAzar();
							System.out.println(inglesaAzar.getNumero()+" de "+inglesaAzar.getPalo());
							break;
						case 2:
							Carta espAzar = barajaEsp.cartaAlAzar();
							System.out.println(espAzar.getNumero()+" de "+espAzar.getPalo());
							break;
						case 3:
							Carta trucoAzar = mazoTruco.cartaAlAzar();
							System.out.println(trucoAzar.getNumero()+" de "+trucoAzar.getPalo());
							break;
						default:
							System.out.println("OPCION INCORRECTA!!");
							break;
						}
						break;
					case 2:
						List<Carta> mano = new ArrayList<>();
						int cant, jugad;
						System.out.print("De cuantas cartas quiere la mano? ");
						cant = teclado.nextInt();
						teclado.nextLine();
						System.out.println("Cuantos jugadores son?");
						jugad = teclado.nextInt();
						teclado.nextLine();
						switch (menu) {
						case 1:
							for (int i=1; i<=jugad; i++) {
								mazo.armarMano(cant);
								mano.addAll(mazo.getMano());
								System.out.println();
								System.out.println("Cartas del Jugador n° "+i);
								for (Carta card : mano) {
									System.out.println(card.getNumero()+" de "+card.getPalo());
								}
								mano.clear();
							}
							break;
						case 2:
							for (int i=1; i<=jugad; i++) {
								barajaEsp.armarMano(cant);
								mano.addAll(barajaEsp.getMano());
								System.out.println();
								System.out.println("Cartas del Jugador n° "+i);
								for (Carta card : mano) {
									System.out.println(card.getNumero()+" de "+card.getPalo());
								}
								mano.clear();
							}
							break;
						case 3:
							for (int i=1; i<=jugad; i++) {
								mazoTruco.armarMano(cant);
								mano.addAll(mazoTruco.getMano());
								System.out.println();
								System.out.println("Cartas del Jugador n° "+i);
								for (Carta card : mano) {
									System.out.println(card.getNumero()+" de "+card.getPalo());
								}
								mano.clear();
							}
							break;
						default:
							System.out.println("OPCION INCORRECTA!!");
							break;
						}
						break;
					case 3:
						switch(menu) {
						case 1:
							mazo.mezclarMazo();
							System.out.println("Cartas mezcladas");
							break;
						case 2:
							barajaEsp.mezclarMazo();
							System.out.println("Cartas mezcladas");
							break;
						case 3:
							mazoTruco.mezclarMazo();
							System.out.println("Cartas mezcladas");
							break;
						default:
							System.out.println("OPCION INCORRECTA!!");
							break;
						}
						break;
					default:
						System.out.println("OPCION INCORRECTA!!");
						break;
					}
				}
			}	
		} while (menu!=0);
		System.out.println("Gracias vuelva pronto");
		teclado.close();
		*/
		
		//Ejercicio 7
		Integer[] numeracion = {1,3,5,7,9,11,13,15,17,19};
		List<Integer> original = Arrays.asList(numeracion);
		List<Integer> mezcla = new ArrayList<>(original);
		Collections.shuffle(mezcla);
		System.out.print("Lista original = ");
		for (Integer n : original) {
			if (original.indexOf(n)==original.size()-1)
				System.out.println(n+".");
			else
				System.out.print(n+", ");
		}
		System.out.print("Lista desordenada = ");
		for (Integer n : mezcla) {
			if (mezcla.indexOf(n)==mezcla.size()-1)
				System.out.println(n+".");
			else
				System.out.print(n+", ");
		}
		
		}
	}

