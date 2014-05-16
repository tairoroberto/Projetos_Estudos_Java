package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTest extends JFrame{
	
	JTextField usuario;
	JPasswordField senha;
	JButton ok;
	JButton cancel;
	
	
	public ControleTest() {
		super("Textos e Senhas");
		
		
		usuario = new JTextField();
		senha = new JPasswordField();
		ok = new JButton("OK");
		cancel = new JButton("Cancel");
		
		//Vinculando Listenrs
		ok.addActionListener(new BotaoOkListener());
		cancel.addActionListener(new BotaoCancelListener());

		// Criando o Container
		Container c = getContentPane();
		c.setLayout(new GridLayout(3, 2));
		c.add(new JLabel("Login"));
		c.add(usuario);
		c.add(new JLabel("Senha"));
		c.add(senha);
		c.add(ok);
		c.add(cancel);
		
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}		
	
	
	class BotaoOkListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String s = " Login: "+usuario.getText()
					+ "\n Senha: " + new String(senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
		}
		
	}
	
	class BotaoCancelListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			usuario.setText("");
			senha.setText("");
		}
		
	}
	
	public static void main(String[] args) {
		new ControleTest();
	}

	


}
