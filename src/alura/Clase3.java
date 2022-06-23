package alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Clase3 {

	public static void main(String[] args) {
		
		List<String> cursos = new ArrayList<>();
		cursos.add("curso de fisica");
		cursos.add("curso de java 8");
		cursos.add("curso de geometria del espacio");
		cursos.add("curso de historia universal");
			
			// metodo sort de la clase list
		cursos.sort(new CompararClase3());
		
		cursos.forEach(new ConsumidorClase3());
		
	}	
}

class ConsumidorClase3 implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s.length());
	}
	
}

class CompararClase3 implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length()<o2.length()) {
			return -1;
		}
		return 0;
	}
	
}