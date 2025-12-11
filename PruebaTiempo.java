package Tema4.practica41;

import java.util.Scanner;

public class PruebaTiempo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;

		System.out.println("Introduce el primer tiempo:");
		System.out.print("Introduce las  horas (h): ");
		horas = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los minutos (m): ");
		minutos =  Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los segundos (s): ");
		segundos =  Integer.parseInt(teclado.nextLine());
		Tiempo c = new Tiempo(horas, minutos, segundos);
		
		System.out.println("Introduce el segundo tiempo:");
		System.out.print("Introduce las  horas (h): ");
		horas = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los minutos (m): ");
		minutos =  Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los segundos (s): ");
		segundos =  Integer.parseInt(teclado.nextLine());

		Tiempo b = new Tiempo(horas, minutos, segundos);
		
		
		System.out.println(c.TiempoResta(b));
		System.out.println("");

		
		
	
		
		

	}

}
