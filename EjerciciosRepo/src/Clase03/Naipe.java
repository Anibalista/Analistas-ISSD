package Clase03;
import java.util.Scanner;

public class Naipe {
	public static Scanner teclado;
	private int numero;
	private String tipo;
	
	public Naipe(String mazo, int num) {
		tipo = mazo;
		numero = num;
	}
	
	public void getNaipe() {
		System.out.println(numero+"  de "+tipo);
	}
	
	public static String setTipeOfNaipe() {
		int palo = (int)(Math.random()*4);
		String mazo = "";
		switch(palo) {
		case 1:
			mazo = "Oro";
			break;
		case 2:
			mazo = "Espadas";
			break;
		case 3:
			mazo = "Copa";
			break;
		case 4:
			mazo = "Basto";
			break;
		}
		return mazo;
	}
	
	public static int setNumberOfNaipe() {
		int num = (int)(Math.random()*12);
		while (num==8 || num==9) {
			num = (int)(Math.random()*12);
		}
		return num;
	}
	
	public static void main(String[]args) {
		teclado = new Scanner(System.in);
		int numJugador[];
		numJugador = new int[3];
		String paloJugador[];
		paloJugador = new String[3];
		System.out.println("Elija con que cartas quiere jugar[3 en total]:");
		for(int i=0; i<paloJugador.length; i++) {
			System.out.println("Palo de la carta "+(i+1)+" (Oro, Basto, Copa, Espadas) ");
			paloJugador[i] = teclado.next();
			System.out.println("Numero de la carta "+(i+1)+" (del 1 al 12, sin 8 ni 9) ");
			numJugador[i] = teclado.nextInt();
			while (numJugador[i]==8 || numJugador[i]==9 || numJugador[i]<1 || numJugador[i]>12) {
				System.out.println("Numero incorrecto (del 1 al 12, sin 8 ni 9) ");
				numJugador[i] = teclado.nextInt();
			}
		}
		
		Naipe naipe1 = new Naipe(paloJugador[0],numJugador[0]);
		Naipe naipe2 = new Naipe(paloJugador[1],numJugador[1]);
		Naipe naipe3 = new Naipe(paloJugador[2],numJugador[2]);
		
		System.out.println("Tus cartas:");
		naipe1.getNaipe();
		naipe2.getNaipe();
		naipe3.getNaipe();
		
		System.out.println("Cartas del rival: ");
		int numRival[];
		numRival = new int[3];
		String paloRival[];
		paloRival = new String[3];
			
		for (int i=0; i<paloRival.length; i++) {
			numRival[i] = setNumberOfNaipe();
			paloRival[i] = setTipeOfNaipe();
			for (int j=0; j<paloJugador.length; j++) {
				if(i!=0) {
					if(numRival[i]==numRival[i-1] && paloRival[i]==paloRival[i-1]) {
						numRival[i] = setNumberOfNaipe();
						paloRival[i] = setTipeOfNaipe();
						i=0;
						j=0;
					}
				}
				if(numRival[i]==numJugador[j] && paloRival[i]==paloJugador[j]) {
					numRival[i] = setNumberOfNaipe();
					paloRival[i] = setTipeOfNaipe();
					i=0;
					j=0;
				}
			}
		}
		Naipe naipeRival1 = new Naipe(paloRival[0],numRival[0]);
		Naipe naipeRival2 = new Naipe(paloRival[1],numRival[1]);
		Naipe naipeRival3 = new Naipe(paloRival[2],numRival[2]);
		naipeRival1.getNaipe();
		naipeRival2.getNaipe();
		naipeRival3.getNaipe();
	}
}
