package clase06;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mazo {
	
	List<List<Carta>> baraja = new ArrayList<>();
	List<Carta> mazo = new ArrayList<>();
	List<Carta> mano = new ArrayList<>();
	List<Integer> numeros = new ArrayList<>();
	private boolean repartir;
	
	public Mazo (List<List<Carta>> baraja) {
		this.baraja = baraja;
	}
	
	public Mazo (String[] palos, String[] numeros) {
		for (int i=0; i<palos.length; i++) {
			for (int j=0; j<numeros.length; j++) {
				Carta carta = new Carta(palos[i], numeros[j]);
				mazo.add(carta);
			}
		}
	}
	
	
	public void armarMano (int cant) {
		Integer numero;
		mano.clear();
		for (int i=0; i<cant; i++) {
			do {
				numero = (int)(Math.random()*mazo.size()-1);
			} while (numeros.contains(numero));
			mano.add(mazo.get(numero));
			numeros.add(numero);
		}
	}
	
	public List<Carta> getMano () {
		return mano;
	}
	
	public List<Carta> getMazo () {
		return mazo;
	}
	
	public void mezclarMazo() {
		Collections.shuffle(mazo);
	}

	public boolean getRepartir() {
		return repartir;
	}
	public List<List<Carta>> getBaraja() {
		return baraja;
	}
	
	public Carta sacarCartaBaraja () {
		int palo = (int)(Math.random()*4)-1;
		int num = (int)(Math.random()*13)-1;
		return baraja.get(palo).get(num);
	}
	
	public Carta cartaAlAzar () {
		int num = (int)(Math.random()*mazo.size())-1;
		return mazo.get(num);
	}
}
