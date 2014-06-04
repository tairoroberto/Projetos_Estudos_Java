package refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Instituição:			Panicobass
 * Projeto:				Sistema de Avaliações
 * Data de Criação:		03/06/2014
 * Criador:				Tairo Roberto Miguel de Assunçao
 * Revisão:				1
 * 
 */
 
/**Restringir a Anotação para apenas classe*/
@Target(ElementType.TYPE)

public @interface Cabecalho {
	String instituição();
	String projeto();
	String dataCriacao();
	String criador(); 
	int revisao() default 1; //Coloca o valor 1 como inicio
	

}
