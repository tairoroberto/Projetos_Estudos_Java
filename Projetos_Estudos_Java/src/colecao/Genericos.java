package colecao;

public class Genericos<E> {

	E elemento;
	
	
	public E getElemento() {
		return elemento;
	}


	public void setElemento(E elemento) {
		this.elemento = elemento;
	}


	public static void main(String[] args) {
		Genericos<String> g = new Genericos<>();
		g.setElemento("magrelo");
		System.out.println(g.getElemento().toUpperCase());
		
	}

}
