package semana3.colas;

public class Main {

	public Main() {
		Cola<Integer> cola = new Cola<Integer>();
		cola.encolar(1);
		cola.encolar(2);
		cola.encolar(3);
		cola.encolar(4);
		cola.encolar(7);
		System.out.println(cola.toString());
		System.out.println(cola.peek());
		System.out.println(cola.quitar());		
		System.out.println(cola.toString());
		System.out.println(cola.toString());
		
	}
	public static void main(String[] args) {
		Main m = new Main();
	}

}
