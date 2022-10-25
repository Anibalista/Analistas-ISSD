package clase04;

public class EjerMatrizUno {
	private int[][] matriz = new int[4][4];
	
	public EjerMatrizUno() {
		System.out.println("Llenado automatico de los componentes de la matriz: ");
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matriz[i][j] = (int)(1+Math.random()*9);
			}
		}
	}
	
	public void imprimir() {
		System.out.println();
		System.out.println("Matriz llena. Resultado: ");
		for(int i=0; i<matriz.length;i++) {
			System.out.print("| ");
			for(int j=0; j<matriz[i].length;j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("|");
		}
	}

	public void getSumaDiagPrincipal() {
		System.out.println();
		int suma = 0;
		for (int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(i==j) {
					suma += matriz[i][j];
				}
			}
		}
		System.out.println("Los valores de la diagonal principal suman: "+suma);
	}
	
	public void getSumaDiagSecundaria() {
		System.out.println();
		int suma = 0;
		for (int i=0; i<matriz.length; i++) {
			for (int j=matriz[i].length-1; j>=0; j--) {
				if (i+j==matriz[i].length-1) {
					suma += matriz[i][j];
				}
			}
		}
		System.out.println("La diagonal secundaria suma en total: "+suma);
	}
	
	public void sumaFila (int fi) {
		int suma = 0;
		if (fi<matriz.length) {
			for (int i=0; i<matriz[fi].length; i++) {
				suma += matriz[fi][i];
			}
			System.out.println("La fila seleccionada suma "+suma);
		} else
			System.out.println("ERROR! La matriz tiene menos filas que eso.");
		
	}
	
	public void promediarElementos() {
		double suma = 0;
		int cantidad;
		double promedio;
		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		cantidad = matriz.length * matriz[0].length;
		promedio = (double)(suma / cantidad);
		System.out.println("El promedio de valor de los elementos es: "+promedio);
    }
	
	public boolean checkSquareMatrix () {
		boolean square;
		if (matriz.length==matriz[0].length) {
			square = true;
		} else {
			square = false;
		}
		return square;
	}
	
	public static void main(String[]args) {
		EjerMatrizUno matriz1 = new EjerMatrizUno();
		matriz1.imprimir();
		if(matriz1.checkSquareMatrix()) {
			matriz1.getSumaDiagPrincipal();
			matriz1.getSumaDiagSecundaria();
		} else 
			System.out.println("ERROR! La matriz no es cuadrada.");
		matriz1.sumaFila(4);
		matriz1.promediarElementos();
	}
}
