package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class IncluirDados {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost/Teste";
		String sql = "INSERT INTO Cliente(nome,endereco,cpf) VALUES (?, ?, ?)";
		String pessoas[] = {"João","Pedro","Caio","Willian","Dioll"};
		try(Connection conexao = DriverManager.getConnection(url,"root","tairo1507");
			PreparedStatement stm = conexao.prepareStatement(sql);) {
				for (int i = 0; i < pessoas.length; i++) {
					stm.setString(1, pessoas[i]);
					stm.setString(2, "xxx"+i);
					stm.setInt(3, 22222);
					
					stm.addBatch();
			}
			
			stm.executeBatch();
			
		} catch (Exception e) {
			e.getMessage();
		}
		
	}

}
