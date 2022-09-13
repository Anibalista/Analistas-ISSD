package Clase03;

public class Cuadrado {
	int lado;
	
	public Cuadrado(int lad) {
		lado = lad;
	}
	
	public String getSize() {
		int superficie = lado*lado;
		String size;
		if(superficie>100) {
			size = "Grande";
		} else {
			size = "Chico";
		}
		return size;
	}
	
	public static void main(String[]args) {
		Cuadrado cuadrado1;
		cuadrado1 = new Cuadrado(5);
		System.out.println("Se trata de un cuadrado "+cuadrado1.getSize());
	}
}
