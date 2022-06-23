package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase7 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso ("curso de fisica", 200));
		cursos.add(new Curso ("curso de geometria del espacio", 500));
		cursos.add(new Curso ("curso de java 8", 400));
		cursos.add(new Curso ("curso de historia universal", 300));
			
		cursos.sort(Comparator.comparing(Curso::getHoras));
		
		cursos.stream().filter(curso -> curso.getHoras() > 300).forEach(System.out::println);
		
		
		
	}	
}

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