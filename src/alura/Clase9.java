package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;

public class Clase9 {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso ("curso de fisica", 200));
		cursos.add(new Curso ("curso de geometria del espacio", 500));
		cursos.add(new Curso ("curso de java 8", 400));
		cursos.add(new Curso ("curso de historia universal", 300));
			
//		cursos.sort(Comparator.comparing(Curso::getHoras));
		
		int suma = cursos.stream().mapToInt(x->x.getHoras()).sum();
		
		OptionalInt max = cursos.stream().mapToInt(x -> x.getHoras()).max();
		
		boolean mayorACien = cursos.stream().allMatch(curso -> curso.getHoras()>210);
		System.out.println(mayorACien);
		
		Optional<Curso> optionalCurso = cursos.stream().filter(curso -> curso.getHoras()>200).findFirst();
		System.out.println(optionalCurso.get().getNombre());
		
		
	}	
}

