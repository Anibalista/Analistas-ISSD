package clase3;

public class Fecha {
	
	private int day, month, year;
	private boolean error;
	
	private String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
	public Fecha() {
		day = 1;
		month = 1;
		year = 2000;
		error = false;
	}
	
	public Fecha(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
		error = false;
	}
	
	public boolean setControlFecha() {
		if (day>31 || month>12 || day<1 || month<1) {
			error = true;
		} else if (month == 2) {
			if(day>29) {
				error = true;
			} else if (day==29 && year%4>0) {
				error = true;
			}
		} else if (day>30 && (month==4 || month==6 || month==9 || month==11)) {
			error = true;
		}
		return error;
	}
	
	public void getFecha() {
		System.out.println("===========================================");
		System.out.println("Hoy es: "+day+" de "+meses[month-1]+" de "+year);
		System.out.println("===========================================");
	}
	
	public void felizNavidad() {
		if(day==25 && month==12) {
			System.out.println("Hoy es Navidad!");
			System.out.println("FELIZ NAVIDAD!!");
		}
	}
	
	public void getSemestre() {
		if (month<=6) {
			System.out.println("Nos encontramos en el primer semestre del año");
		} else {
			System.out.println("Nos encontramos en el segundo semestre del año");
		}
		System.out.println("===========================================");
	}
	
	public static void main(String[]ar) {
		
		Fecha calendario1 = new Fecha();
		Fecha calendario2 = new Fecha(29,2,2020);
		
		System.out.println("Calendario 1");
		System.out.println();
		calendario1.getFecha();
		calendario1.getSemestre();
		calendario1.felizNavidad();
		
		System.out.println("Calendario 2");
		System.out.println();
		if (calendario2.setControlFecha()) {
			System.out.println("ERROR! Fecha inexistente. El programa no puede continuar");
		} else {
			calendario2.getFecha();
			calendario2.getSemestre();
			calendario2.felizNavidad();
		}
		System.out.println("");
		System.out.println("*=================================================*");
		System.out.println("|**** Muchas gracias por usar mi programa :) *****|");
		System.out.println("*=================================================*");
	}
}
