package ar.edu.ungs.prog2.ticketek;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String email,nombre,apellido,contrasenia;
	private List<IEntrada> entradas; 
	public Usuario(String nombre, String apellido, String email, String contrasenia) {
		this.email=email;
		this.nombre=nombre;
		this.apellido=apellido;
		this.contrasenia=contrasenia;
	}
	
	public Usuario() {
	        this.entradas = new ArrayList<>();
	    }

	public void agregarEntrada(Entrada nuevaEntrada) {
		// TODO Apéndice de método generado automáticamente
		 if (nuevaEntrada != null) {
	            entradas.add(nuevaEntrada);
	            System.out.println("Entrada agregada con éxito.");
	        } else {
	            System.out.println("La entrada no puede ser nula.");
	      }
		 
		
	}
	 public List<IEntrada> getEntradas() {
	        return entradas;
	    }
	 
	 public String getContrasenia() {
	        return contrasenia;
	    }
	 public String getEmail() {
	        return email;
	    }
	 
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Nombre de Usuario: ").append(nombre).append(" | Apellido: ").append(apellido).append(" | Email: ").append(email).append(" | contraseña: ").append(contrasenia);
		
		sb.append(this.entradas);
		
		return   sb.toString();
		}

	public boolean autenticarUsuario(String email, String contrasenia) {
		// TODO Apéndice de método generado automáticamente
		if(this.email.equals(email) && this.contrasenia.equals(contrasenia)) {
			return true;
		}
		return false;
	}





}
