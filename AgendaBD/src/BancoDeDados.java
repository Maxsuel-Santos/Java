import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BancoDeDados {
	
	public static void line() {
        System.out.print("=====================================================================\n");
    }
	
	private Connection  connection = null;
	private Statement statement = null;
	private ResultSet resultset = null;
	
	
	public void conectar() {
		String servidor = "jdbc:mysql://localhost:3306/agenda"; // Localhost - BD do Usuário
		String usuario = "root"; // root - Localhost
		String senha = ""; // null - Localhost
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			this.connection = DriverManager.getConnection(servidor, usuario, senha);
			this.statement = this.connection.createStatement();
			
		} catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}		
	}
	
	
	public boolean estaConectado() {
		if(this.connection != null)
			return true;
		else
			return false;
	}
	
	// Listar Contatos
	public void listarContatos() {
		try {
			String query = "SELECT * FROM contato ORDER BY nome ASC";
			this.resultset = this.statement.executeQuery(query);
			//this.statement = this.connection.createStatement();
			while(this.resultset.next()) {
			
			line();
				
			System.out.println("Id: " + this.resultset.getString("id") +
						       "\nNome: " + this.resultset.getString("nome") + 
						       "\nTelefone: " + this.resultset.getString("telefone"));
			}
			
			line();
			
		} catch(Exception e)	{
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	// Inserir Contatos
	public void inserirContato(String nome, String telefone) {
		try {
			String query = "INSERT INTO contato (nome, telefone) VALUES ('" + nome + "', '" + telefone + "');";
			this.statement.executeUpdate(query);
		} catch (Exception e){
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	// Apagar Contato
	public void apagarContato(String id) { // Pode ser por nome ao invés de id
		try {
			String query = "DELETE FROM contato WHERE id = " + id + ";";
			this.statement.executeUpdate(query);
		} catch (Exception e){
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	// Pesquisar
	public void pesquisarContato(String nome) {
		try {
			String query = "SELECT nome FROM contato WHERE nome = '" + nome + "';";
			this.statement.executeQuery(query);
			this.resultset = this.statement.executeQuery(query);
			//this.statement = this.connection.createStatement();
			
			if(this.resultset.next()) {
				System.out.println("Nome encontrado!");
			} else {
				System.out.println("Nome NÃO encontrado!");
			}
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());			
		}
	}
	
	public void desconectar() {
		try {
			this.connection.close();
		} catch(Exception e) {
			System.out.println("erro - em desconectar: " + e.getMessage());
		}
	}
}
