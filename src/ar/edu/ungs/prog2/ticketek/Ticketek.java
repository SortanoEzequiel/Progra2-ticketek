package ar.edu.ungs.prog2.ticketek;


import java.util.*;

public class Ticketek implements ITicketek {
	
	private HashMap<String, Usuario> usuarios;
	private HashMap<String, Sede> sedes;
	private HashMap<String, Espectaculo> espectaculos;
	private HashMap<String, Funcion> funciones;
	
	public Ticketek() {
		this.usuarios=new HashMap<>();
		this.sedes= new HashMap<>();
		this.espectaculos=new HashMap<>();
		this.funciones = new HashMap<>();
	}

	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima) {
		if(sedes.containsKey(nombre)) {
			throw new RuntimeException("La Estadio de Futbol ya existe");
		}
		sedes.put(nombre, new EstadioFutbol(nombre,direccion,capacidadMaxima));
		
	}

	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			String[] sectores, int[] capacidad, int[] porcentajeAdicional) {
		if(sedes.containsKey(nombre)) {
			throw new RuntimeException("El Teatro ya existe");
		}
		sedes.put(nombre, new Teatro(nombre,direccion,capacidadMaxima,asientosPorFila,
				sectores,capacidad,porcentajeAdicional));
	}

	@Override
	public void registrarSede(String nombre, String direccion, int capacidadMaxima, int asientosPorFila,
			int cantidadPuestos, double precioConsumicion, String[] sectores, int[] capacidad,
			int[] porcentajeAdicional) {
		if(sedes.containsKey(nombre)) {
			throw new RuntimeException("El MiniEstadio ya existe");
		}
		sedes.put(nombre, new MiniEstadio(nombre,direccion,capacidadMaxima,asientosPorFila,
				cantidadPuestos,precioConsumicion,sectores,capacidad,porcentajeAdicional));

	}

	
	
	@Override
	public void registrarUsuario(String nombre, String apellido, String email, String contrasenia) {
		if(usuarios.containsKey(email)) {
			throw new RuntimeException("El usuario ya está registrado");
		}
		Usuario usuarioNuevo = new Usuario(nombre,apellido,email,contrasenia);
		usuarios.put(email, usuarioNuevo);
	}

	@Override
	public void registrarEspectaculo(String nombre) {
		if(espectaculos.containsKey(nombre)) {
			throw new RuntimeException("El espectaculo ya esta registrado");
		}
		Espectaculo espectaculoNuevo = new Espectaculo(nombre,null,null);
		espectaculos.put(nombre, espectaculoNuevo);
	}

	@Override
	public void agregarFuncion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		if(espectaculos.containsKey(fecha) ) {
			throw new RuntimeException("La funcion ya existe");
		}
		Funcion nuevaFuncion = new Funcion(nombreEspectaculo, fecha, sede, precioBase);
		funciones.put(fecha, nuevaFuncion);
	}

	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			int cantidadEntradas) {
		// TODO Auto-generated method stub
		if(!espectaculos.containsKey(nombreEspectaculo)) {
			throw new RuntimeException(" El espectaculo no existe");
		}
		//Entrada nuevaEntrada = new Entrada(nombreEspectaculo, fecha, email, contrasenia, cantidadEntradas);
		
		 
		
		return  null;
	}

	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			String sector, int[] asientos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String listarFunciones(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarEntradasEspectaculo(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarEntradasFuturas(String email, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IEntrada> listarTodasLasEntradasDelUsuario(String email, String contrasenia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean anularEntrada(IEntrada entrada, String contrasenia) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public IEntrada cambiarEntrada(IEntrada entrada, String contrasenia, String fecha, String sector, int asiento) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntrada cambiarEntrada(IEntrada entrada, String contrasenia, String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double costoEntrada(String nombreEspectaculo, String fecha) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double costoEntrada(String nombreEspectaculo, String fecha, String sector) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalRecaudado(String nombreEspectaculo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double totalRecaudadoPorSede(String nombreEspectaculo, String nombreSede) {
		// TODO Auto-generated method stub
		return 0;
	}

		
		public String toString() {
		    StringBuilder sb = new StringBuilder();

		    sb.append("Usuarios:\n");
		    for (String email : usuarios.keySet()) {
		        Usuario u = usuarios.get(email);
		        
		        sb.append("  ").append(u).append("\n");
		    }
		    sb.append("Sedes:\n");
		    for (String nombre : sedes.keySet()) {
		        Sede u = sedes.get(nombre);
		     
		        sb.append("  ").append(u).append("\n");
		    }
		    sb.append("Espectaculos:\n");
		    for (String nombre : espectaculos.keySet()) {
		        Espectaculo esp = espectaculos.get(nombre);
		   
		        sb.append("  ").append(esp).append("\n");
		    }
		    
		    sb.append("Funciones:\n");
		    for (String fecha : funciones.keySet()) {
		        Funcion esp = funciones.get(fecha);
		 
		        sb.append("  ").append(esp).append("\n");
		    }

		    return sb.toString();
		}
}
