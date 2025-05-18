package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Espectaculo {

	private String nombreEsp,codigoEsp;
	private HashMap<String, Funcion> funciones;

	public Espectaculo(String nombreEsp, String codigoEsp) {
		this.nombreEsp=nombreEsp;
		this.codigoEsp=codigoEsp;
		this.funciones = new HashMap<>();
	}
	
	public String getNombre() {
		return this.nombreEsp;
	}
	public HashMap<String,Funcion> getFunciones() {
		return funciones;
	}
	public void agregarFuncion(Funcion funcion) {
		if(funciones.containsKey(funcion.getFecha())) {
			throw new RuntimeException("Ya existe una funcion para ésta fecha");
	}
		funciones.put(funcion.getFecha(), funcion);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nombreEsp);
		sb.append("\n");
		for(Funcion fun : funciones.values()) {
			sb.append(fun);
			sb.append("\n");
		}
		return sb.toString();
	}

	public boolean tieneFuncionEnFecha(String fecha) {
		// TODO Apéndice de método generado automáticamente
		return funciones.containsKey(fecha);
	}

}
