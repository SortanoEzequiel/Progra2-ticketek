package ar.edu.ungs.prog2.ticketek;

import java.util.List;

public class Funcion {
	private String sede, fecha, nombreEspectaculo;
	private Double precioBase;
	private List<Entrada> entradas;  

	public Funcion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		// TODO Apéndice de constructor generado automáticamente
		this.nombreEspectaculo = nombreEspectaculo;
		this.fecha = fecha;
		this.sede = sede;
		this.precioBase = precioBase;
	}
	
	@Override
	public String toString() {
	 StringBuilder sb = new StringBuilder();
	
	 sb.append(" Funcion: ").append(nombreEspectaculo).append(" | fecha: ");
	 sb.append(fecha).append(" | sede: ").append(sede).append(" | Precio Base: ").append(precioBase);
	return sb.toString();
	}

}
