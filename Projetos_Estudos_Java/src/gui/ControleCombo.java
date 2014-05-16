package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/imagem_1.png")),
			new ImageIcon(getClass().getResource("fotos/imagem_2.jpg")),
			new ImageIcon(getClass().getResource("fotos/imagem_3.jpg")),
			new ImageIcon(getClass().getResource("fotos/imagem_4.jpg")), 
			};

	public ControleCombo() {
		super("Album de Fotos");

		// Recuperando o container
		Container c = getContentPane();

		// Inicializando as vaariaveis e adicionando os listeners
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("Imagem numero 1");
		combo.addItem("Imagem numero 2");
		combo.addItem("Imagem numero 3");
		combo.addItem("Imagem numero 4");
		combo.addItemListener(new ComboListener());
		label = new JLabel(imagens[0]);

		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}

	class ComboListener implements ItemListener {
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
				label.setIcon(imagens[combo.getSelectedIndex()]);
			}
		}
	}

	public static void main(String[] args) {
		new ControleCombo();
	}

}
