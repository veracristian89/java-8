package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase5 {

	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<>();
		cursos.add("curso de fisica");
		cursos.add("curso de java 8");
		cursos.add("curso de geometria del espacio");
		cursos.add("curso de historia universal");
			
		cursos.sort(Comparator.comparing(x -> x.length()));
		
		cursos.forEach(curso -> System.out.println(curso));
		
		
	}	
}

