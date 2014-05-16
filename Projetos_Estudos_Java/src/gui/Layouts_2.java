package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts_2 extends JFrame {
	public Layouts_2() {
		super("Layouts 2");
		
		Container c = getContentPane();
		//adicionando um BordertLayout com espaçamento de 5 Pixels
		c.setLayout(new BorderLayout(5,5));
		
		c.add(BorderLayout.NORTH,new JButton("N"));
		c.add(BorderLayout.SOUTH,new JButton("S"));
		c.add(BorderLayout.CENTER,new JButton("C"));
		c.add(BorderLayout.EAST,new JButton("E"));
		c.add(BorderLayout.WEST,new JButton("W"));
		
		
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layouts_2();
	}

}
