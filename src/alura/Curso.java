package alura;

class Curso {
	
	private String nombre;
	private int horas;
	
	public Curso(String nombre, int horas) {
		this.nombre = nombre;
		this.horas = horas;
		
	}

	public String getNombre() {
		return nombre;
	}

	public int getHoras() {
		return horas;
	}

	@Override
	public String toString() {
		return "nombre= " + nombre + ", horas= " + horas;
	}
	
	
}