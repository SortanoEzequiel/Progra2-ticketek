package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;

public class Espectaculo {

	private String nombreEsp,codigoEsp;
	private List<Funcion> funciones;

	public Espectaculo(String nombreEsp, String codigoEsp, List<Funcion> funciones) {
		this.nombreEsp=nombreEsp;
		this.codigoEsp=codigoEsp;
		this.funciones= funciones;
		
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Espectaculo: ").append(nombreEsp);
		return sb.toString();
	}

}
