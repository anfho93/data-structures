package semana2.collectionslistas.enlazada;

public class Main {

	public Main() {
		ListaEnlazada<Integer> miLista = new ListaEnlazada<Integer>();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
		miLista.add(4);
		System.out.println(miLista.toString());	
		miLista.remove(3);
		System.out.println(miLista.toString());	
		System.out.println(miLista.contains(4));
		System.out.println("-----Lista circular-----");
		ListaCircular<Integer> miListaC = new ListaCircular<Integer>();
		miListaC.add(1);
		miListaC.add(2);
		miListaC.add(3);
		miListaC.add(4);
		miListaC.add(5);
		System.out.println(miListaC.toString());
		miListaC.remove(5);
		System.out.println(miListaC.toString());
		miListaC.remove(1);
		System.out.println(miListaC.toString());
	}
	
	
	public static void main(String[] args) {
		Main m = new Main();
	}

}

