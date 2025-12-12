package Codigo;

import java.util.Scanner;
public static IntroducirHoras(){
		Scanner teclado = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;

		System.out.print("Introduce las  horas (h): ");
		horas = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los minutos (m): ");
		minutos =  Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce los segundos (s): ");
		segundos =  Integer.parseInt(teclado.nextLine());
		System.out.println();

}
public class PruebTiempo {
    	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas;
		int minutos;
		int segundos;

		IntroducirHoras
		Tiempo c = new Tiempo(horas, minutos, segundos);
		
		
		IntroducirHoras
		Tiempo b = new Tiempo(horas, minutos, segundos);
		
		
		System.out.println(c.TiempoResta(b));
		System.out.println("");

		teclado.close();

		
		
	
		
		

	}
}
