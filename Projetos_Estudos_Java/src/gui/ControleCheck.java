package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame{

	JTextField txtTexto;
	JCheckBox ckBold;
	JCheckBox ckItalico;
	
	public ControleCheck(){
		super();
		
		//Cria o container
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//Inicializa as variáveis
		ckItalico = new JCheckBox("Itálico");
		ckBold = new JCheckBox("Negrito");
		txtTexto = new JTextField("Veja a Fonte Mudar",12);
		
		//Referencia as classes de eventos 
		ckBold.addItemListener(new ChecListener());
		ckItalico.addItemListener(new ChecListener());
	
		txtTexto.setFont(new Font("serif", Font.PLAIN, 22));
		
		
		
		c.add(txtTexto);
		c.add(BorderLayout.EAST,ckItalico);
		c.add(BorderLayout.WEST,ckBold);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	
	class ChecListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (ckBold.isSelected() && ckItalico.isSelected()) {
				txtTexto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			} else if (ckBold.isSelected()) {
				txtTexto.setFont(new Font("serif", Font.BOLD, 26));
			} else if (ckItalico.isSelected()) {
				txtTexto.setFont(new Font("serif", Font.ITALIC, 26));
			}else{
				txtTexto.setFont(new Font("serif", Font.PLAIN, 22));
			}
		}

	}


	public static void main(String[] args) {
		new ControleCheck();
	}

}
