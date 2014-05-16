package Java;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int vetor[] = new int[5];
		vetor[0]=0;
		vetor[1]=10;
		vetor[2]=100;
		vetor[3]=1000;
		vetor[4]=10000;
		
		for(int i = 0 ; i<vetor.length; i++)
		{
			System.out.println("I:"+ i + " --> Valor:" + vetor[i]);
		}
   
	}

}
