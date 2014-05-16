package Arrays;
import java.util.Random;


public class ArrayMultidimencional {

	/**
	 * Array Multidimencional 
	 */
	public static void main(String[] args) {
		//Trabalhando com array multidimencional 
		
		String[] faces= {"A","1","2","3","4","5","6","7","8","9","Dama","Valete","Rei"};
		String[] nipes= {"Espada","Copas","Ouro","Paus"};
		
		Random r = new Random();
		
		String face = faces[r.nextInt(faces.length)];
		String nipe = nipes[r.nextInt(nipes.length)];
		
		String carta = face +" "+ nipe;
		
		System.out.println(carta);
		

	}

}
