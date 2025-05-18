package ar.edu.ungs.prog2.ticketek;

public class Main {

	public static void main(String[] args) {
		
		Ticketek tk = new Ticketek();
		
		tk.registrarSede("Monumental", "rivadavia 123", 80000);
		
		System.out.println(tk.toString());
		
		
		

	}

}
