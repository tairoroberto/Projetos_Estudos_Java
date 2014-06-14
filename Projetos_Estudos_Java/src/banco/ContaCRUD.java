package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ContaCRUD {
	
	public void criar(Connection con, Conta conta) {
		String sql = "INSERT INTO Conta VALUES (?,?,?)";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.cliente);
			stm.setDouble(3, conta.saldo);
			stm.executeUpdate();
	
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	public List<Conta> ler(Connection con){
		
		List<Conta> lista =  new ArrayList<>();
			String sql = "SELECT numero, cliente, saldo FROM Conta";
		try (PreparedStatement stm = con.prepareStatement(sql);
			 ResultSet resultado = stm.executeQuery()) {
			
			while(resultado.next()){
				lista.add(new Conta(resultado.getInt(1),resultado.getString(2),resultado.getDouble(3)));
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		return lista;
	}
	
	
	public void alterar(Connection con, Conta conta) {
		String sql = "UPDATE Conta SET cliente = ?, saldo = ? WHERE numero = ?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			
			stm.setString(1, conta.cliente);
			stm.setDouble(2, conta.saldo);
			stm.setInt(3, conta.numero);
			stm.executeUpdate();
	
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	

	public void deletar(Connection con, Conta conta) {
		String sql = "DELETE FROM Conta WHERE numero = ?";
		try (PreparedStatement stm = con.prepareStatement(sql)) {
			
			stm.setInt(1, conta.numero);
			stm.executeUpdate();
	
		} catch (Exception e) {
			e.getMessage();
		}
	}
	

	public void trasferir(Connection con, Conta origem,Conta destino, double valor){
		if (origem.saldo >= valor) {
			try {
				con.setAutoCommit(false);
				
				/* Saque */
				origem.saldo -= valor;
				alterar(con, origem);

				/* Deposito */
				destino.saldo += valor;
				alterar(con, destino);

				con.commit();
			} catch (Exception e) {
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		
		}
	}
	
	
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/Teste";
		try(Connection con = DriverManager.getConnection(url, "root","tairo1507")){
			ContaCRUD crud = new ContaCRUD();
		
					
			List<Conta> contas = crud.ler(con);
			for (Conta conta : contas) {
				System.out.println(conta);
			} 
			
			Conta origem = contas.get(0);
			Conta destino = contas.get(1);
			
			crud.trasferir(con, origem, destino, 500);
					
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		
		
		
		
	}
}
