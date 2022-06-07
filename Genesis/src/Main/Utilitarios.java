package Main;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;

import Models.JogoConfiguracao;
import Models.Pergunta;

public class Utilitarios {
	// Funcao que realiza a leitura do arquivo JSON
	public static String LerArquivoJson(String caminho) throws IOException {

		List<String> linhas = Files.readAllLines(Paths.get(caminho), Charset.forName("UTF-8"));

		String retorno = new String();

		for (String e : linhas) {
			retorno += e + "\n";
		}
		return retorno;
	}

	// Funcao que recebe todas as perguntas do JSON
	public static ArrayList<Pergunta> ObterPerguntas() throws IOException {

		String json = LerArquivoJson("./src/Configs/perguntas.json");

		ArrayList<Pergunta> perguntas = new Gson().fromJson(json, JogoConfiguracao.class).perguntas;

		return perguntas;
	}

	public static ArrayList<Pergunta> ObterPerguntasFase(int faseId) throws IOException {
		// Obtem todas as perguntas do JSON
		ArrayList<Pergunta> perguntas = ObterPerguntas();

		// Remove aquelas que não pertencem a fase
		perguntas.removeIf(p -> p.faseId != faseId);

		Collections.shuffle(perguntas);

		return perguntas;
	}

	// Função para limpar a tela do cmd
	public static void LimparTela() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void ExibirTexto(String texto) throws Exception {
		for (int i = 0; i < texto.length(); i++) {
			Thread.sleep(15);
			System.out.print(texto.charAt(i));
		}
	}

	public static void ExibirTexto(String texto, int tempo) throws Exception {
		for (int i = 0; i < texto.length(); i++) {
			Thread.sleep(tempo);
			System.out.print(texto.charAt(i));
		}
	}

	public static void LimparEAguardar() throws IOException {
		// System.in.read();

		// Utilitarios.LimparTela();
	}

}
