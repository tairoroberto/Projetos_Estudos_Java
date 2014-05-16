package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class Calculadora_exemplo extends JFrame {

	private JPanel contentPane;
	private JTextField field;
	double valor1;
	double valor2;
	double result;
	/**
	 * @wbp.nonvisual location=453,118
	 */
	private final MaskFormatter maskFormatter = new MaskFormatter();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_exemplo frame = new Calculadora_exemplo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora_exemplo() {
		try {
			maskFormatter.setMask("##,##");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		setTitle("Calculadora");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		field = new JTextField();
		field.setHorizontalAlignment(SwingConstants.RIGHT);
		field.setBounds(10, 32, 356, 31);
		contentPane.add(field);
		field.setColumns(10);

		JButton btnBackspace = new JButton("Backspace");
		btnBackspace.setBounds(125, 74, 100, 31);
		contentPane.add(btnBackspace);

		JButton button = new JButton("1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (field.getText().isEmpty()) {
					field.setText("1");
				} else {
					String texto = field.getText();
					texto = texto.concat("1");
					field.setText(texto);
				}

			}
		});
		button.setBounds(21, 131, 50, 40);
		contentPane.add(button);

		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("2");
				} else {
					String texto = field.getText();
					texto = texto.concat("2");
					field.setText(texto);
				}
			}
		});
		button_1.setBounds(95, 131, 50, 40);
		contentPane.add(button_1);

		JButton button_2 = new JButton("3");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("3");
				} else {
					String texto = field.getText();
					texto = texto.concat("3");
					field.setText(texto);
				}
			}
		});
		button_2.setBounds(163, 131, 50, 40);
		contentPane.add(button_2);

		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("4");
				} else {
					String texto = field.getText();
					texto = texto.concat("4");
					field.setText(texto);
				}
			}
		});
		button_3.setBounds(21, 193, 50, 40);
		contentPane.add(button_3);

		JButton button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("5");
				} else {
					String texto = field.getText();
					texto = texto.concat("5");
					field.setText(texto);
				}
			}
		});
		button_4.setBounds(95, 193, 50, 40);
		contentPane.add(button_4);

		JButton button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("6");
				} else {
					String texto = field.getText();
					texto = texto.concat("6");
					field.setText(texto);
				}
			}
		});
		button_5.setBounds(163, 193, 50, 40);
		contentPane.add(button_5);

		JButton button_6 = new JButton("7");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("7");
				} else {
					String texto = field.getText();
					texto = texto.concat("7");
					field.setText(texto);
				}
			}
		});
		button_6.setBounds(21, 252, 50, 40);
		contentPane.add(button_6);

		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("8");
				} else {
					String texto = field.getText();
					texto = texto.concat("8");
					field.setText(texto);
				}
			}
		});
		button_7.setBounds(95, 252, 50, 40);
		contentPane.add(button_7);

		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("9");
				} else {
					String texto = field.getText();
					texto = texto.concat("9");
					field.setText(texto);
				}
			}
		});
		button_8.setBounds(163, 252, 50, 40);
		contentPane.add(button_8);

		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("0");
				} else {
					String texto = field.getText();
					texto = texto.concat("0");
					field.setText(texto);
				}
			}
		});
		btnNewButton.setBounds(21, 309, 50, 40);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(field.getText());
				result = valor1 + valor2;

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(247, 131, 50, 40);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(247, 193, 50, 40);
		contentPane.add(btnNewButton_2);

		JButton button_9 = new JButton("/");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 1));
		button_9.setBounds(247, 249, 50, 40);
		contentPane.add(button_9);

		JButton button_10 = new JButton("*");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button_10.setBounds(247, 305, 50, 40);
		contentPane.add(button_10);

		JButton btnNewButton_3 = new JButton("=");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				field.setText(String.valueOf(result));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_3.setBounds(307, 252, 46, 97);
		contentPane.add(btnNewButton_3);

		JButton button_11 = new JButton("+/-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {
					field.setText("-");
				} else {
					String texto = field.getText();
					String caracter = "-";
					texto = caracter.concat(texto);
					field.setText(texto);

				}
			}
		});
		button_11.setBounds(95, 309, 50, 40);
		contentPane.add(button_11);

		JButton button_12 = new JButton(",");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (field.getText().isEmpty()) {

				} else {
					String texto = field.getText();
					String caracter = ",";
					texto = texto.concat(",");
					field.setText(texto);

				}
			}
		});
		button_12.setBounds(163, 309, 50, 40);
		contentPane.add(button_12);

		JButton button_13 = new JButton("%");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_13.setBounds(307, 129, 50, 40);
		contentPane.add(button_13);

		JButton button_14 = new JButton("");
		button_14.setBounds(307, 193, 50, 40);
		contentPane.add(button_14);
	}
}