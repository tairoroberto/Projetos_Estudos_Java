package refinado;

import java.io.Serializable;

/** Usando as Anotações */
@SuppressWarnings("serial")
@Cabecalho(
		   criador = "Tairo Roberto Miguel de Assunçao", 
		   dataCriacao = "03/06/2014", 
		   instituição = "Panicobass", 
		   projeto = "Sistema de Avaliações", 
		   revisao = 2
	)

/**Maneiras de inicializar uma Anotação*/
@ErrosCorrigidos(erros = {"0001","0002"})


public class Anotacao implements Serializable{

	
	@Deprecated
	public void anotar() {
		
	}
	@Override
	public String toString(){
		return null;
	}
	
}
