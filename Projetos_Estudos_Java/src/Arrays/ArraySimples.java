package Arrays;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class ArraySimples {

	public static void main(String[] args) {
		
		String paises[] = {"Brasil","Argentina","Armenia","Camboja","Guatemala"};

	
		System.out.println(Arrays.toString(paises));
	    String procura = JOptionPane.showInputDialog(null,"Qual Pa�s Est� Procurando ");
		int posicao = Arrays.binarySearch(paises, procura);
	
		JOptionPane.showMessageDialog(null, "O Pa�s que Vo� procura est� na Posi��o: "+ posicao);
        Arrays.sort(paises, 0, paises.length);
        System.out.println(Arrays.toString(paises));
        
        Double[] valor = {12.909,13.00,34.3434,5.43};
        System.out.println(valor[0].doubleValue());
		
	}

}
