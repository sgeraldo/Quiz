package persistency;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Início da classe de conexão//

public class ConexaoMySQL {
	
	public Connection conn;
	public PreparedStatement stmt;
	public ResultSet rs;

public void OpenConexao() throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	try {
		conn = DriverManager.getConnection("jdbc:mysql://172.19.0.56:3306/indicadores","ssilva","inpi123");
		System.out.println("Sucesso...");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Falha:"+e.getMessage());
	}
	
}

public void CloseConexao() throws Exception{
	try {
		conn.close();
		System.out.println("Fechou...");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Falha:"+e.getMessage());
	}
	
}

}