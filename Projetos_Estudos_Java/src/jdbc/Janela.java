package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEndereco;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sql = "INSERT INTO Cliente(nome,endereco,cpf) VALUES (?,?,?)";
				
				String userName = "root";
				String password = "tairo1507";
				String url = "jdbc:mysql://localhost/Teste";
				try {
					Class.forName("com.mysql.jdbc.Driver").newInstance();
				} catch (InstantiationException | IllegalAccessException
						| ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				}
				
				try (Connection conn = (Connection) DriverManager.getConnection(url, userName, password);
						PreparedStatement stm = conn.prepareStatement(sql)) {
					
					stm.setString(1, txtNome.getText());
					stm.setString(2, txtEndereco.getText());
					stm.setString(3, txtCpf.getText());
					stm.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Inserido com sucesso");
					
					txtNome.setText("");
					txtEndereco.setText("");
					txtCpf.setText("");
					
					stm.close();
					conn.close();
					
				} catch (Exception ex) {
					System.out.println(ex.getMessage()); 
				}
			}
		});
		
		
		contentPane.add(btnSalvar, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNome = new JLabel("Nome:");
		panel.add(lblNome);
		
		txtNome = new JTextField();
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco");
		panel.add(lblEndereco);
		
		txtEndereco = new JTextField();
		panel.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel.add(panel_1);
		
		JLabel lblCpf = new JLabel("Cpf");
		panel_1.add(lblCpf);
		
		txtCpf = new JTextField();
		panel_1.add(txtCpf);
		txtCpf.setColumns(10);
	}

}
