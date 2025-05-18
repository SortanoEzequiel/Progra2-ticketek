package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
	private String sede, fecha, nombreEspectaculo;
	private Double precioBase;
	private int capacidadTotal;
	private int entradasVendidas;
	private List<IEntrada> listaEntradas;
	 

	public Funcion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		// TODO Apéndice de constructor generado automáticamente
		this.nombreEspectaculo = nombreEspectaculo;
		this.fecha = fecha;
		this.sede = sede;
		this.precioBase = precioBase;
	    this.entradasVendidas = 0;
	    this.listaEntradas = new ArrayList<>();
	}
	public String getNombreEspectaculo() {
		return nombreEspectaculo;
	}
	public String getNombre(){
		StringBuilder sb = new StringBuilder();
		sb.append(nombreEspectaculo).append(fecha).append(sede).append(precioBase);
		return sb.toString();
	}
	public String getFecha() {
		// TODO Apéndice de método generado automáticamente
		
		return fecha;
	}
	
	public String getSede() {
		// TODO Apéndice de método generado automáticamente
		return sede;
	}
	
	public int getEntradasDisponibles() {
	        return capacidadTotal - entradasVendidas;
	    }
	
	public void agregarEntrada(IEntrada nuevaEntrada, String sector) {
			if (entradasVendidas < capacidadTotal) { // Verificar disponibilidad
	            
				listaEntradas.add(nuevaEntrada);  // Agregar la entrada a la lista
	            entradasVendidas++;               // Actualizar contador de entradas vendidas
	        } else {
	            throw new RuntimeException("No hay más entradas disponibles para esta función.");
	        }
	    }
	
	@Override
	public String toString() {
	 StringBuilder sb = new StringBuilder();
	
	 sb.append("   Funcion: ").append(nombreEspectaculo).append(" | fecha: ");
	 sb.append(fecha).append(" | sede: ").append(sede).append(" | Precio Base: ").append(precioBase);
	return sb.toString();
	}
	
	

}
