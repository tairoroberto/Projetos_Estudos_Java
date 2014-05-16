package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DesafioCalculadora extends JFrame{
	
	JTextField numero;
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,
			btn9,btnMais,btnMenos,btnMultiplicar,btnDividir,
			btnIgual, btnPonto;
		
	public DesafioCalculadora() {
		super("Desafio Calculadora");
		
		//Inicializando os componentes
		btn0 = new JButton("0");
		btn1= new JButton("1");
		btn2= new JButton("2");
		btn3= new JButton("3");
		btn4= new JButton("4");
		btn5= new JButton("5");
		btn6= new JButton("6");
		btn7= new JButton("7");
		btn8= new JButton("8");
		btn9= new JButton("9");
		
		btnMais= new JButton("+");
		btnMenos = new JButton("-");
		btnMultiplicar = new JButton("*");
		btnDividir= new JButton("/");
		btnIgual= new JButton("=");
		btnPonto = new JButton(".");
		numero = new JTextField();
		
	
		// Criando o Container
		Container c0 = getContentPane();
		Container c1 = new JPanel();
		
		c0.setLayout(new BorderLayout(2,2));
		c1.setLayout(new GridLayout(4,4,5,5));
		
		c1.add(btn7);
		c1.add(btn8);
		c1.add(btn9);
		c1.add(btnDividir);
		
		c1.add(btn4);
		c1.add(btn5);
		c1.add(btn6);
		c1.add(btnMultiplicar);
		
		c1.add(btn1);
		c1.add(btn2);
		c1.add(btn3);
		c1.add(btnMenos);
		
		c1.add(btn0);
		c1.add(btnPonto);
		c1.add(btnIgual);
		c1.add(btnMais);
		
		numero.setFont(new Font("serif", Font.PLAIN, 26));
		
		c0.add(BorderLayout.NORTH,numero);
		c0.add(BorderLayout.CENTER,c1);
		
		
		//Adincionando os Listenrs
		btn0.addActionListener(new Botao0());
		btn1.addActionListener(new Botao1());
		btn2.addActionListener(new Botao2());
		btn3.addActionListener(new Botao3());
		btn4.addActionListener(new Botao4());
		btn5.addActionListener(new Botao5());
		btn6.addActionListener(new Botao6());
		btn7.addActionListener(new Botao7());
		btn8.addActionListener(new Botao8());
		btn9.addActionListener(new Botao9());
				
		btnMais.addActionListener(new BotaoMais());
		btnMenos.addActionListener(new BotaoMenos());
		btnMultiplicar.addActionListener(new BotaoMultiplicar());
		btnDividir.addActionListener(new BotaoDividir());
		btnPonto.addActionListener(new BotaoPonto());
		btnIgual.addActionListener(new BotaoIgual());
		
	
		//Configurando o fechamneto da Janela, tamanho e visibilidade.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}		
	
	//Classes de listenrs
	class Botao0 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("0");
			} else {
				String n = numero.getText();
				n = n.concat("0");
				numero.setText(n);
			}
		}
	}
	class Botao1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("1");
			} else {
				String n = numero.getText();
				n = n.concat("1");
				numero.setText(n);
			}
		}
	}
	class Botao2 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("2");
			} else {
				String n = numero.getText();
				n = n.concat("2");
				numero.setText(n);
			}
		}
	}
	class Botao3 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("3");
			} else {
				String n = numero.getText();
				n = n.concat("3");
				numero.setText(n);
			}
		}
	}
	class Botao4 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("4");
			} else {
				String n = numero.getText();
				n = n.concat("4");
				numero.setText(n);
			}
		}
	}
	class Botao5 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("5");
			} else {
				String n = numero.getText();
				n = n.concat("5");
				numero.setText(n);
			}
		}
	}
	class Botao6 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("6");
			} else {
				String n = numero.getText();
				n = n.concat("6");
				numero.setText(n);
			}
		}
	}
	class Botao7 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("7");
			} else {
				String n = numero.getText();
				n = n.concat("7");
				numero.setText(n);
			}
		}
	}
	class Botao8 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("8");
			} else {
				String n = numero.getText();
				n = n.concat("8");
				numero.setText(n);
			}
		}
	}
	class Botao9 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("9");
			} else {
				String n = numero.getText();
				n = n.concat("9");
				numero.setText(n);
			}
		}
	}

	class BotaoMais implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("+");
			} else {
				String n = numero.getText();
				n = n.concat("+");
				numero.setText(n);
			}
		}
	}
	class BotaoMenos implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("-");
			} else {
				String n = numero.getText();
				n = n.concat("-");
				numero.setText(n);
			}
		}
	}
	class BotaoMultiplicar implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("*");
			} else {
				String n = numero.getText();
				n = n.concat("*");
				numero.setText(n);
			}
		}
	}
	class BotaoDividir implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText("/");
			} else {
				String n = numero.getText();
				n = n.concat("/");
				numero.setText(n);
			}
		}
	}
	class BotaoPonto implements ActionListener{
		@Override
	public void actionPerformed(ActionEvent arg0) {
			if (numero.getText().isEmpty()) {
				numero.setText(".");
			} else {
				String n = numero.getText();
				n = n.concat(".");
				numero.setText(n);
			}
		}
		
	}
	
	class BotaoIgual implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {

			double soma = 0;
			String[] a = numero.getText().split("\\+");	
			for (String string : a) {
				System.out.println(string);
			}

		}
	}

	
	
	public static void main(String[] args) {
		new DesafioCalculadora();
	}

}
