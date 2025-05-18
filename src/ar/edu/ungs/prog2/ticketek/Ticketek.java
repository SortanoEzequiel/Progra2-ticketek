package ar.edu.ungs.prog2.ticketek;


import java.util.*;

public class Ticketek implements ITicketek {
	
	private HashMap<String, Usuario> usuarios;
	private HashMap<String, Sede> sedes;
	private HashMap<String, Espectaculo> espectaculos;
	
	
	public Ticketek() {
		this.usuarios=new HashMap<>();
		this.sedes= new HashMap<>();
		this.espectaculos=new HashMap<>();
		
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
		Espectaculo espectaculoNuevo = new Espectaculo(nombre,null);
		espectaculos.put(nombre, espectaculoNuevo);
	}

	@Override
	public void agregarFuncion(String nombreEspectaculo, String fecha, String sede, double precioBase) {
		Espectaculo espectaculo = espectaculos.get(nombreEspectaculo);
        if (espectaculo == null) {
            throw new IllegalArgumentException("Espectáculo no encontrado");
        }
        
        Sede sedeObj = sedes.get(sede);
        if (sedeObj == null) {
            throw new IllegalArgumentException("Sede no encontrada");
        }
        
        if (espectaculo.tieneFuncionEnFecha(fecha)) {
            throw new IllegalArgumentException("Ya existe una función para esa fecha");
     } 
        Funcion nuevaFuncion = new Funcion(nombreEspectaculo, fecha, sede, precioBase);
        espectaculo.agregarFuncion(nuevaFuncion);
    }

	@Override
	public List<IEntrada> venderEntrada(String nombreEspectaculo, String fecha, String email, String contrasenia,
			int cantidadEntradas) {
		// TODO Auto-generated method stub
		   // Autenticar usuario
		if(!usuarios.containsKey(email) && !usuarios.get(email).getContrasenia().equals(contrasenia)) {
		   throw new RuntimeException("Usuario invalido");
		}
		
		if(!espectaculos.containsKey(nombreEspectaculo)) {
			throw new RuntimeException("No existe espectaculo");
		}
		
        if(!espectaculos.get(nombreEspectaculo).getFunciones().containsKey(fecha)) {
        	throw new RuntimeException("No existe Funcion");
        }
       
        
        
     /*   if (espectaculos.get(nombreEspectaculo).getFunciones().values() instanceof EstadioFutbol) {
            throw new IllegalArgumentException("Esta sede requiere selección de sector y asiento");
        }else {
        	
        }*/
	   
        List<IEntrada> entradas = new ArrayList<>();
        int contadorEntradas = 1;
        
        for (int i = 0; i < cantidadEntradas; i++) {
            Entrada entrada = new Entrada(nombreEspectaculo, fecha, email, contrasenia, contadorEntradas);
            espectaculos.get(nombreEspectaculo).getFunciones().get(nombreEspectaculo).agregarEntrada(entrada);
            usuario.agregarEntrada(entrada);
            entradas.add(entrada);
            contadorEntradas++;
        }
        return entradas;
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
		StringBuilder resultado = new StringBuilder();
        if(espectaculos.containsKey(nombreEspectaculo)) {
        	resultado.append(espectaculos.get(nombreEspectaculo).getFunciones());
        }
	 
	  
		return resultado.toString();
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
		 if (!usuarios.containsKey(email) || !usuarios.get(email).getContrasenia().equals(contrasenia)) {
		        throw new RuntimeException("Usuario o contraseña incorrectos.");
		    }
		  
      return usuarios.get(email).getEntradas();
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
		    sb.append("\n");
		    sb.append("Sedes:\n");
		    for (String nombre : sedes.keySet()) {
		        Sede u = sedes.get(nombre);
		     
		        sb.append("  ").append(u).append("\n");
		    }
		    sb.append("\n");
		    sb.append("Espectaculos:\n");
		    for (String nombre : espectaculos.keySet()) {
		        Espectaculo esp = espectaculos.get(nombre);
		   
		        sb.append("  ").append(esp).append("\n");
		    }
		    sb.append("\n");
		    

		    return sb.toString();
		}
}
