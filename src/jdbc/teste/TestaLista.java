package jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import jdbc.dao.ContatoDao;
import jdbc.modelo.Contato;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereco: " + contato.getEndereco());
			System.out.println("Data de Nascimento: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(contato.getDataNascimento().getTime()) + "\n");
		}
	}

}
