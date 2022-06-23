package alura;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Clase11 {

	public static void main(String[] args) {
		
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaMundial = LocalDate.of(2022, 9, 15);
									// puede ser dias meses o años
		System.out.println(ChronoUnit.DAYS.between(fechaActual, fechaMundial));
		
		
		
	}
	
}
