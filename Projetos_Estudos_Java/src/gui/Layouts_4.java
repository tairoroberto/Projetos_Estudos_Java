package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_4 extends JFrame {
	public Layouts_4() {
		super("Layouts 4");
		
		Container c1 = getContentPane();
		c1.setLayout(new BorderLayout());
		
		Container c2 = new JPanel();
		
		//adicionando um GridLayout com 4 linhas e 1 coluna
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		//Configurando o layout Principal com o GrigLayout dolado dele
		c1.add(BorderLayout.CENTER, new JButton("Centro"));
		c1.add(BorderLayout.EAST,c2);
		
		
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Layouts_4();
	}

}
