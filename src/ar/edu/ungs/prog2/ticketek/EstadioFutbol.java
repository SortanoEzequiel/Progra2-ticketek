package ar.edu.ungs.prog2.ticketek;

public class EstadioFutbol extends Sede {

	private Sector sectorCampo;
	
	public EstadioFutbol(String nombre, String direccion, Integer capacidadMaxima) {
		super(nombre, direccion, capacidadMaxima);
		
	}

	@Override
	public double calcularPrecio() {
		return precioBase;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Estadio de Futbol: ").append(nombre).append(" | Direccion: ").append(direccion).append(" | Capacidad: ").append(capacidadMaxima);
		return sb.toString();
	}

}
