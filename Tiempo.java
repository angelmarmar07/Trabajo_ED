package Tema4.practica41;

import java.time.LocalTime;

public class Tiempo {
	private final int horas;
	private final int minutos;
	private final int segundos;

	public Tiempo(int horas, int minutos, int segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public Tiempo TiempoSuma(Tiempo otro) {
		int hora;
		int minutos;
		int segundos;
		LocalTime a = LocalTime.of(getHoras(), getMinutos(), getSegundos());
		LocalTime b = LocalTime.of(otro.getHoras(), otro.getMinutos(), otro.getSegundos());

		hora = a.getHour() + b.getHour();
		minutos = a.getMinute() + b.getMinute();
		segundos = a.getSecond() + b.getSecond();

		if (minutos >= 60) {
			hora++;
			minutos = minutos - 60;
		}
		if (segundos >= 60) {
			minutos++;
			segundos = segundos - 60;
		}
		Tiempo nuevo;
		return nuevo = new Tiempo(hora, minutos, segundos);
	}
	
	public Tiempo TiempoResta(Tiempo otro) {
		int hora;
		int minutos;
		int segundos;
		LocalTime a = LocalTime.of(getHoras(), getMinutos(), getSegundos());
		LocalTime b = LocalTime.of(otro.getHoras(), otro.getMinutos(), otro.getSegundos());

		hora = a.getHour() - b.getHour();
		minutos = a.getMinute() - b.getMinute();
		segundos = a.getSecond() - b.getSecond();
		
		if (hora <= 0) {
			hora = 0;
		}
		if (minutos < 0) {
			hora--;
			minutos = minutos- (-60) ;
		}

		if (segundos < 0) {
			minutos--;
			segundos =   segundos - (-60)   ;
		}
		Tiempo c;
		return c = new Tiempo(hora, minutos, segundos);

	}

	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	@Override
	public String toString() {
		return ""+ horas + "h " + minutos+ "m " + segundos+ "s ";
	}
	
	

}
