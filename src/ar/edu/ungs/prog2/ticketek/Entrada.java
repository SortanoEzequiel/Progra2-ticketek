package ar.edu.ungs.prog2.ticketek;

import java.util.List;

public class Entrada implements IEntrada {
	
	private String nombreEspectaculo, fecha, email, contrasenia;
	private int cantidadEntradas;
	private Double precioBase;
	public Entrada(String nombreEspectaculo, String fecha, String email, String contrasenia, int cantidadEntradas) {
		// TODO Apéndice de constructor generado automáticamente
		
		this.nombreEspectaculo = nombreEspectaculo;
		this.fecha = fecha;
		this.email = email;
		this.contrasenia = contrasenia;
		this.cantidadEntradas = cantidadEntradas;
		this.precioBase = 90000.0;
	}

	@Override
	public double precio() {
		// TODO Apéndice de método generado automáticamente
		return precioBase;
	}

	@Override
	public String ubicacion() {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

}
