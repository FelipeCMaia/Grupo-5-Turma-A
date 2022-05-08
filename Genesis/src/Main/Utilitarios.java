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
	public static String LerArquivoJson(String caminho) throws IOException {
		
		List<String> linhas = Files.readAllLines(Paths.get(caminho),Charset.forName("UTF-8"));
		
		String retorno = new String();
		
		for(String e : linhas) { retorno += e + "\n";}
		return retorno;
	}
	
	public static ArrayList<Pergunta> ObterPerguntas() throws IOException {

		String json = LerArquivoJson("./src/config.json");

		ArrayList<Pergunta> perguntas = new Gson().fromJson(json, JogoConfiguracao.class).perguntas;
		
		return perguntas;
	}
	
	public static ArrayList<Pergunta> ObterPerguntasFase(int faseId) throws IOException {
		ArrayList<Pergunta> perguntas = ObterPerguntas();
				
		perguntas.removeIf(p -> p.faseId != faseId);
		
		Collections.shuffle(perguntas);
		
		return perguntas;
	}
	
	public static void LimparTela() {
		System.out.print("\033[H\033[2J");  
	    System.out.flush();
	}
		
}
