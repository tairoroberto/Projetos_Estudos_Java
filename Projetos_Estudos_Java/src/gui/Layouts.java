package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
	
	public Layouts(){
		super("Layouts");
		
		//Adcionando um container para os componentes
		Container c = getContentPane();
		
		//Adicionando um a botão na posição Norte do nosso BorderLayout
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
				
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Layouts();
	}

}
