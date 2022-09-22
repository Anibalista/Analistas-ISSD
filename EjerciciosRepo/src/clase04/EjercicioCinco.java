package clase04;

public class EjercicioCinco {
	private String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	private int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public void getMeses31() {
		System.out.print("Mese con 31 días: ");
		for(int i=0; i<meses.length; i++) {
			if(dias[i]==31) {
				System.out.print(meses[i]);
			}
			if(i==meses.length-1) {
				System.out.println(".");
			} else if(dias[i]==31){
				System.out.print(", ");
			}
		}
	}

	public static void main(String[]args) {
		EjercicioCinco calendario1 = new EjercicioCinco();
		calendario1.getMeses31();
	}
}
