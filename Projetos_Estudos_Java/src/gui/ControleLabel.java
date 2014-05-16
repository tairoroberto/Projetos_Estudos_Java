package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	JLabel labelSimples;
	JLabel labelFonte;
	JLabel labelImagem;
	
	
	public ControleLabel() {
		super("Controle Label");
		
		//Criando o Container e
		Container c = getContentPane();
		c.setLayout(new  FlowLayout());
		
		//Criando Um label simples
		labelSimples = new JLabel("Label simples");
		labelSimples.setToolTipText("Meu TooTip");
		
		//Criando Um label com uma fonte diferente e cor
		Font fonte = new Font("serif",Font.BOLD | Font.ITALIC, 28);
		labelFonte = new JLabel("Label com fonte");
		labelFonte.setFont(fonte);
		labelFonte.setForeground(Color.BLUE);
		
		//Criando label com uma imagem
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/luz.png"));
		labelImagem = new JLabel(icon);
		
		
		//Adicionando os compoentes ao container
		c.add(labelSimples);
		c.add(labelFonte);
		c.add(labelImagem);
		
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}		

	public static void main(String[] args) {
		new ControleLabel();
	}


}
