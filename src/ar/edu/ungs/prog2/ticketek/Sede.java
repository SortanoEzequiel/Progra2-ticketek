package ar.edu.ungs.prog2.ticketek;

public abstract class Sede {

	protected String nombre;
	protected String direccion;
	protected Integer capacidadMaxima;
	protected Double precioBase;
	
	public Sede(String nombre, String direccion, Integer capacidadMaxima) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.capacidadMaxima = capacidadMaxima;
		this.precioBase = 90000.0;
		
	}
    
	
	
	
	public double precio() {
		// TODO Auto-generated method stub
		return precioBase;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nombre: ").append(nombre).append(" | ").append("Direccion: ").append(direccion).append(" | ").append("Capacidad máxima: ").append(capacidadMaxima);
		
		return sb.toString();
	}
	
}
