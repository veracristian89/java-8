package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase4 {

	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<>();
		cursos.add("curso de fisica");
		cursos.add("curso de java 8");
		cursos.add("curso de geometria del espacio");
		cursos.add("curso de historia universal");
			
		cursos.sort((o1, o2) -> {
			return Integer.compare(o1.length(), o2.length());
		});
		
		cursos.forEach(curso -> System.out.println(curso));
		
		
	}	
}

