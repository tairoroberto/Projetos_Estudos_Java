package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{
	
	JTextArea textArea;
	JButton botao;
	
	public ControleTextArea(){
		super("Editor de Texto");
		
		textArea = new JTextArea();
		textArea.setFont(new Font("serif", Font.PLAIN, 22));
		
		//Recuperando o container
		Container c = getContentPane();
		
		//Criando uma ScrollPane para rolagem do nosso editor de texto 
		JScrollPane scroll = new JScrollPane(textArea);
	
		
		botao = new JButton("Abrir arquivo");
		botao.setFont(new Font("serif", Font.PLAIN, 22));
		botao.addActionListener(this);
		
		//Adicionandoao Componentes ao container
		c.add(BorderLayout.CENTER,scroll);
		c.add(BorderLayout.SOUTH,botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Abre o dseletor de arquivos
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		
		//Coloca o arquivo escolhido detro de um arquivo novo
		File file = c.getSelectedFile();
		
		try {
			//Pegao caminha Absoluto do arquivo 
			Path path = Paths.get(file.getAbsolutePath());
			
			//TRasforma o array de bytes em uma String
			String retorno = new String(Files.readAllBytes(path));
			
			//Seta a String na nossa TextArea
			textArea.setText(retorno);

		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Não foi possível abrir o arquivo");
		}
	}

	
	public static void main(String[] args) {
		new ControleTextArea();
	}

}
