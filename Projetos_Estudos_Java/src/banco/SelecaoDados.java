package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelecaoDados {
	public static void main(String[] args) {
		
		String sql = "select * from Cliente";
		String url = "jdbc:mysql://localhost/Teste";
		String usuario = "root";
		String senha = "tairo1507";
		try(Connection conexao = DriverManager.getConnection(url, usuario, senha);
			PreparedStatement stm = conexao.prepareStatement(sql);
			ResultSet resultado = stm.executeQuery()){
				while(resultado.next()){
					//System.out.println(resultado.getString("nome"));
					String busca = resultado.getString("idCliente")
									+"--"+ resultado.getString("nome")
									+"--"+ resultado.getString("endereco")
									+"--"+ resultado.getString("cpf");
					System.out.println(busca);
				}
		}catch (Exception e) {
			e.getMessage();
		}
		
	}
}
