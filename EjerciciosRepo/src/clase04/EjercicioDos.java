package clase04;

public class EjercicioDos {
	
	private float[] altura = new float[5];
	
	public EjercicioDos(float[] alt) {
		System.out.println("Alturas de 5 personas en metros");
		System.out.println();
		for(int i=0; i<altura.length; i++) {
			this.altura[i] = alt[i];
			System.out.print("- "+this.altura[i]+"m");
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");
	}
	
	public float getPromedio() {
		float promedio = 0f;
		System.out.println("");
		System.out.println("Altura promedio:");
		System.out.println("");
		for(int i=0; i<altura.length; i++) {
			promedio += altura[i];
		}
		promedio /= altura.length;
		System.out.printf("%.2fm %n",promedio);
		System.out.println("");
		System.out.println("--------------------------------------------------");
		return promedio;
	}
	
	public void getAltasyBajas(float promedio) {
		int altas=0; int bajas=0; int igual=0;
		System.out.println("");
		for(int i=0; i<altura.length; i++) {
			if(altura[i]>promedio) {
				altas++;
			} else if(altura[i]<promedio) {
				bajas++;
			} else {
				igual++;
			}
		}
		if(altas>0) {
			System.out.println("Hay"+altas+"personas mas altas que la media");
		}
		if(bajas>0) {
			System.out.println("Hay"+bajas+"personas mas bajas que la media");
		}
		if(igual>0) {
			System.out.println("Hay"+igual+"personas con altura promedio");
		}
		System.out.println("");
		System.out.println("--------------------------------------------------");
	}
	
	public static void main(String[]ar) {
		
		float[] alturaCarga = {1.76f, 1.58f, 1.67f, 1.87f, 1.92f};
		EjercicioDos alturas1 = new EjercicioDos(alturaCarga);
		
		alturas1.getAltasyBajas(alturas1.getPromedio());
		
	}
}
