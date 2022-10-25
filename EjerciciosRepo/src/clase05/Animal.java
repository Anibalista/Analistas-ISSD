package clase05;

public class Animal {
	
	protected String nombre, locate, ruido;
	protected double sizeCm;
	
	public Animal(String nombre, String locate, String ruido, double sizeCm) {
		super();
		this.nombre = nombre;
		this.locate = locate;
		this.ruido = ruido;
		this.sizeCm = sizeCm;
	}
		
	public void comer () {
		System.out.println(":)");
	}
	
	public void dormir () {
		System.out.println("Zzzzzzzzzzzzzzzz");
	}
	
	public void hacerRuido() {
		System.out.println(ruido+"!!");
		System.out.println();
	}
	
	public void caer() {
		System.out.println("%&$#%..."+ruido);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}

	public String getRuido() {
		return ruido;
	}

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}

	public double getSizeCm() {
		return sizeCm;
	}

	public void setSizeCm(double sizeCm) {
		this.sizeCm = sizeCm;
	}
	
	
}
