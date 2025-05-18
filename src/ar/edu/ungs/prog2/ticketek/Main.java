package ar.edu.ungs.prog2.ticketek;

public class Main {

	public static void main(String[] args) {
		
		Ticketek tk = new Ticketek();
		
		tk.registrarSede("Monumental", "rivadavia 123", 80000);
		tk.registrarUsuario("Ezequiel", "sortano", "sortano59@gmail", "1234");
		tk.registrarEspectaculo("Airbag");
		tk.registrarEspectaculo("La renga");
		tk.registrarSede("Teatro Colon", "Cordoba 1234", 50000);
		tk.agregarFuncion("Airbag", "10/06/25", "Monumental", 90000.0);
		tk.agregarFuncion("Airbag", "1/06/25", "Teatro Colon", 90000.0);
		tk.agregarFuncion("Airbag", "16/06/25", "Teatro Colon", 90000.0);
		tk.agregarFuncion("La renga", "10/06/25", "Monumental", 90000.0);
		System.out.println(tk.toString());
		
		
	

	}

}
