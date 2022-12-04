public class Agenda {
	public static void main(String[] args) {
		BancoDeDados bancoDeDados = new BancoDeDados();
		bancoDeDados.conectar();
		
		if(bancoDeDados.estaConectado()) {
			bancoDeDados.listarContatos(); // SELECT dos dados inseridos
			//bancoDeDados.inserirContato("Marivaldo Pereira", "(77) 91371533"); // Nome e Telefone
			//bancoDeDados.apagarContato("6");
			//bancoDeDados.pesquisarContato("Maxsuel Santos");
			bancoDeDados.desconectar();
		} else {
			System.out.println("Não foi possível conectar ao banco de dados.");
		}
	}
}
