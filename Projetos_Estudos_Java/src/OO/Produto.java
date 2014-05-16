package OO;

public class Produto {

	protected String descricao;
	protected int quantidade;
	
	public Produto(String desc,int quant){
		descricao = desc;
		quantidade= quant;
	}
	
	public String tpoString(){
		return new String(" "+descricao +" "+quantidade);
	}
	
	// Forma preferida para impress�o na tela
 

	
	

}
