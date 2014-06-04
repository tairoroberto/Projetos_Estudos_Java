package redes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtMensagem;
	
	private Socket socket;
	private PrintWriter escritor;
	private String nome;
	
	private void configurarRede(){
		try {
			 socket = new Socket("127.0.0.1",5000);
			 escritor = new PrintWriter(socket.getOutputStream());
			 
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatCliente frame = new ChatCliente("Tairo");
					ChatCliente frame2 = new ChatCliente("lu");
					frame.setVisible(true);
					frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChatCliente(final String nome) {
		setTitle("Chat :" + nome);
		this.nome = nome;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 58);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtMensagem = new JTextField();
		txtMensagem.setFont(new Font("Serif", Font.BOLD, 14));
		contentPane.add(txtMensagem, BorderLayout.CENTER);
		txtMensagem.setColumns(10);
		
		configurarRede();
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escritor.println(nome + ":"  + txtMensagem.getText());
				escritor.flush();
				txtMensagem.setText("");
				txtMensagem.requestFocus();
			}
		});
		btnEnviar.setFont(new Font("Serif", Font.BOLD, 13));
		contentPane.add(btnEnviar, BorderLayout.EAST);
	}

}
