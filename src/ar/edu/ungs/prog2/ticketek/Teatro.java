package ar.edu.ungs.prog2.ticketek;

import java.util.*;

public class Teatro extends Sede {
	
	private String [] sectores;
	private Integer asientosPorFila;
	private int[] capacidadPorSector, porcentajeAdicional; 
	public Teatro(String nombre, String direccion, int capacidadMaxima, int asientosPorFila, String[] nombresSectores,
			int[] capacidad, int[] porcentajeAdicional) {
		super(nombre, direccion, capacidadMaxima);
		
        this.asientosPorFila = asientosPorFila;
        this.sectores = nombresSectores;
        this.capacidadPorSector = capacidad;
        this.porcentajeAdicional = porcentajeAdicional;
		//for (int i = 0; i < nombresSectores.length; i++) {
          //  sectores.put(nombresSectores[i], 
            //new Sector(nombresSectores[i], capacidad[i], porcentajeAdicional[i]));
		//}
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Teatro: ").append(nombre).append(" | ").append("Direccion: ");
		sb.append(direccion).append(" | ").append("Capacidad máxima: ").append(capacidadMaxima);
		sb.append(" | ");
		sb.append("Sectores: ");
		for(String sector : this.sectores) {
			sb.append(sector);
			sb.append(", ");
		}
		sb.deleteCharAt(sb.length() - 2);
		
		sb.append(" | ");
		sb.append("Capacidad por sector: ");
		for(int capacidad : this.capacidadPorSector) {
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
