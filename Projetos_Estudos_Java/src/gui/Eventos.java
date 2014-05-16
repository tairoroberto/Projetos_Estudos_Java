package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {
	
	JButton botao;
	
	public Eventos() {
		super("Eventos");
		
		//Criando o Container e adcionando um componente
		Container c = getContentPane();
		botao = new JButton("Clicar");
		botao.addActionListener(this);
		c.add(botao);
	
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}		
	
	//Tratando os eventos do botão
	public void actionPerformed(ActionEvent e) {
		this.botao.setText("Foi Clicado");
	}

	public static void main(String[] args) {
		new Eventos();
	}


}
