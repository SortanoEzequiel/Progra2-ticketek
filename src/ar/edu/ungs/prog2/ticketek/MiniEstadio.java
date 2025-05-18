package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;

public class MiniEstadio extends Sede {

	private String[] sectores;
	private Integer asientosPorFila,cantidadPuestos;
	private Double precioConsumicion;
	private int[]capacidad,porcentajeAdicional;

	public MiniEstadio(String nombre, String direccion, int capacidadMaxima, int asientosPorFila, int cantidadPuestos,
			double precioConsumicion, String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		super(nombre, direccion, capacidadMaxima);
		this.asientosPorFila = asientosPorFila;
		this.cantidadPuestos = cantidadPuestos;
		this.precioConsumicion = precioConsumicion;
		this.capacidad = capacidad;
		this.porcentajeAdicional = porcentajeAdicional;
		this.sectores = sectores;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Miniestadio: ").append(nombre).append(" | ").append("Direccion: ").append(direccion).append(" | ").append("Capacidad máxima: ").append(capacidadMaxima);
		sb.append(" | ");
		sb.append("Asientos por fila: ").append(asientosPorFila).append(" | ");
		sb.append(" | ");
		sb.append("Cantidad de puestos: ").append(cantidadPuestos).append(" | ");
		sb.append(" | ");
		sb.append("Precio por consumición: ").append(precioConsumicion).append(" | ");
		sb.append("Sectores: ");
		for(String sector : this.sectores) {
			sb.append(sector);
			sb.append(", ");
		}
		sb.deleteCharAt(sb.length() - 2);
		
		sb.append(" | ");
		sb.append("Capacidad por sector: ");
		for(int capacidad : this.capacidad) {
			sb.append(capacidad);
			sb.append(", ");
		}
		sb.deleteCharAt(sb.length() - 2);
		
		sb.append(" | ");
		sb.append("Porcentaje adicional por sector: ");
		for(int porcentaje: this.porcentajeAdicional) {
			sb.append(porcentaje);
			sb.append(", ");
		}
		sb.deleteCharAt(sb.length() - 2);
		
		return sb.toString();

	}
}
