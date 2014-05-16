package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{

	public Janela(){
		
		/**
		JFrame frame = new JFrame(); //Construtor da classe
		frame.setSize(300, 300);//Tamanho
		frame.setVisible(true);//Visibilidade
		//Pegando o container Panel e adicionando componentes.
		JButton butao = new JButton("Clicar");
		frame.getContentPane().add(butao);
		//Metodo de fechamento ao clicar no X
		//Ao clicar em fechar a janela, fecha também a aplicação
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
		
/**********************************************************************/
/**	Extendendo a classe Janela da classe JFRAME não é necessário 
 * 	chamar o frame a todo momento, podendo ser passado os
 * 	parametros diretamente 
 ***********************************************************************/
		super("Minha Janela");
		setSize(300, 300);//Tamanho
		setVisible(true);//Visibilidade
		
		//Pegando o container Panel e adicionando componentes.
		JButton butao = new JButton("Clicar");
		getContentPane().add(butao);
		
		//Metodo de fechamento ao clicar no X
		//Ao clicar em fechar a janela, fecha também a aplicação
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		
		new Janela();
	}

}
