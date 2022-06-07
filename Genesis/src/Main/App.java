package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Models.Alternativa;
import Models.Pergunta;

public class App {

	public static void main(String[] args) throws Exception {

		Scanner entrada = new Scanner(System.in);

		String menu;

		boolean errado = true;

		// Do para repetir o jogo ate a opcao de sair
		do {

			System.out.println(" -- MENU -- ");
			//
			System.out.println("<1> Instrucoes");
			//
			System.out.println("<2> Jogar");
			//
			System.out.println("<3> Creditos");
			//
			System.out.println("<4> Sair");

			menu = entrada.next();

			// Switch que verifica qual a opcao selecionada pelo usuario
			switch (menu) {

				case "1":
					System.out.println("Mecanismo e introducao do jogo: "
							+ "O jogo consiste em acerta perguntas, com cada acerto voce ganha pecas do robo. \n"
							+ "Seu objetivo e salvar a humanidade do controle dos Robos e vencer a CPU mae. \n"
							+ "Serao 5 perguntas voltadas aos componentes do PC, para montagem do robo. \r\n"
							+ "Cada pergunta respondida errada nesta fase, voce perdera o maximo de vida disponivel. \n"
							+ "E tera perguntas para enfrentar os inimigos.\r\n"
							+ "Cada resposta errada sera como um dano que o inimigo ira te dar. \n \n"

							+ "Niveis de dificuldades; \n"

							+ "- Facil - Perguntas faceis, perdendo 1 vida; \n"

							+ "- Medio - Perguntas medias, perdendo 1 vida; \n"

							+ "- Dificil - Perguntas dificeis, perdendo 2 vidas.");
					break;

				case "2":
					Jogar();
					break;

				case "3":
					System.out.println("SENAC:  \n\n"
							+ "Cleyton Silva \n"
							+ "Felipe Maia \n"
							+ "Felipe Santos \n"
							+ "Professor Eduardo Takeo \n"
							+ "Professor Andersson \n");
					break;

				case "4":
					System.out.println("Saiu.");
					errado = false;
					break;

				default:
					System.out.println("Resposta Invalida");
					break;

			}

		} while (errado);

	}

	// Funcao para executar o jogo
	public static void Jogar() throws Exception {
		Utilitarios.LimparTela();

		// Declaracao de variaveis
		String nome;
		int dificuldade;
		int vidas = 5;
		Scanner reader = new Scanner(System.in);
		String resposta = null;
		Alternativa alt = null;
		Pergunta pergunta = null;
		ArrayList<Pergunta> perguntasFase1 = Utilitarios.ObterPerguntasFase(1);
		ArrayList<Pergunta> perguntasFase2 = Utilitarios.ObterPerguntasFase(2);
		boolean valido = false;

		System.out.println("Digite o seu nome: ");
		nome = reader.nextLine();

		do {
			System.out.println("Selecione a dificuldade");
			System.out.println("1 - Fácil");
			System.out.println("2 - Médio");
			System.out.println("3 - Difícil");
			dificuldade = reader.nextInt();

			if (dificuldade < 1 || dificuldade > 3) {
				System.out.println("Digite um valor valido");
			} else {
				valido = true;
			}

		} while (!valido);

		Utilitarios.LimparTela();

		// #region Exibicao da Historia

		Utilitarios.ExibirTexto("Seu recomeço se inicia em 2100, em um mundo devastado e controlado pelas \n"
				+ "maquinas que utilizam os seres humanos que restaram como fonte de energia e os rejeitados \n"
				+ "eram tratados como gados, tudo ocorreu depois de um grande acontecimento no ano de 2085 um forte \n"
				+ "impacto foi sentindo ao sul do Brasil, algo vindo do espaço em uma caixa misteriosa selada com \n"
				+ "símbolos estranhos e uma forte luz que se emitia da mesma. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Um senhor de certa idade, pegou o objeto não identificado e o levou para a casa, \n"
				+ "curioso com a caixa e com a luz que ela emitia pegou um pé de cabra e tentou abri-la, com sucesso, \n"
				+ "foi a partir desse momento o caos começou na Terra. Micro maquinas se juntaram formando uma  criatura \n"
				+ "estranha que pulou em seu rosto e apoderou-se do seu cérebro entrando em suas vias respiratórias, disso \n"
				+ "surgiu o primeiro ser humano controlado pelas nano cpu-s eles utilizavam os corpos controlados para \n"
				+ "sua própria reprodução, diante disso iniciou-se a dominação mundial. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Apesar disso haviam seres humanos que eram rejeitados e não podiam ser controlados \n"
				+ "por conta de seu tipo sanguíneo -O (Por conta do seu tipo raro de sangue e por sua ausência de antígenos), \n"
				+ "esses ser humanos eram usados como gados para reprodução da própria população, taxados como Divergentes. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Você, isso mesmo você que está lendo essa introdução, você é um divergente,\n"
				+ "depois de uma grande fuga de uma das fazendas, por acidente você encontra um dos GENESIS (são os Robôs) \n"
				+ "defeituoso que foi descartado, com medo você acerta o robô com um pedaço de madeira e o derruba, achando \n"
				+ "que o matou você começa a vasculhar o mesmo com a esperança de descobrir uma vulnerabilidade no Robô, você \n"
				+ "utiliza seus conhecimentos em Conceitos da Computação e começa estudar as peças do Robô. \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Descobrindo uma falha no sistema desse Robô, você se aproveita disso \n"
				+ "para reconstruir seu próprio Robô utilizando as peças do mesmo e as aprimorando. Com a última \n"
				+ "esperança da humanidade construída, você parte em busca de libertar todos os humanos controlados \n"
				+ "pelas nano cpu-s. Porém algo inacreditável te aguarda... \n \n");

		Utilitarios.LimparEAguardar();

		Utilitarios.ExibirTexto("Com a descoberta da falha dos Robôs, você se aproveita disso e parte em \n"
				+ "busca de mais peças tentando localizar mais robôs defeituosos descartados. Nesse caminho você \n"
				+ "irá enfrentar desafios e irá tentar supera-los, e cada falha será problemático para seu robô, \n"
				+ "mas não desista todos nós precisaremos de você.2");

		Utilitarios.LimparEAguardar();

		// #endregion

		System.out.println("\n \n");

		// For que realiza a primeira fase de perguntas
		for (int i = 0; i < 5; i++) {
			pergunta = perguntasFase1.get(i);

			System.out.println((i + 1) + " - " + pergunta.pergunta);

			// For para exibir as alternativas
			for (int j = 0; j < pergunta.alternativas.size(); j++) {
				alt = pergunta.alternativas.get(j);

				System.out.println(alt.letra + ") " + alt.texto);
			}

			resposta = reader.next();

			Utilitarios.LimparTela();

			// If que verifica se a resposta digitada foi correta
			// Se nao diminui as vidas restantes
			if (pergunta.RespostaCorreta(resposta.toUpperCase())) {
				System.out.println("Parabens!!! Resposta Correta!! \n");
			} else {
				System.out.println("Ops!! Resposta Errada \n");
				vidas = vidas - dificuldade;

				// Valida se ainda possui vidas para continuar no jogo para
				// Se nao encerra o jogo
				if (!PossuiVidas(vidas)) {
					Utilitarios.LimparTela();

					Utilitarios.ExibirTexto(
							"Não, seu Robô foi destruído, corra, fuja, se esconda. Você é nossa única esperança tente novamente, mas não desista. \n \n");

					// System.in.read();

					return;
				}

				System.out.printf("Ainda restam %d vidas \n \n", vidas);
			}
		}

		System.out.println('-');

		Utilitarios.ExibirTexto("Após esses desafios, você finalmente consegue montar seu próprio Robô, \n"
				+ "uma máquina mortífera que irá te ajudar na sua vingança assim por dizer. Porém teste lhe aguardam \n"
				+ "para alcançar o núcleo de todo esse caos no planeta terra, vá divergente use sua inteligência e enfrente seus inimigos. \n");

		Utilitarios.LimparEAguardar();

		System.out.println(" \n Fase 2 \n \n");

		Utilitarios
				.ExibirTexto("Agora com seu sua máquina pronta você parte em direção ao centro de controle do inimigo \n "
						+ "onde suas forças estão concentradas e onde você deverá enfrentrar seu primeiro inimigo na busca de seu objetivo");

		// For que realiza a segunda fase de perguntas
		for (int i = 1; i <= 3; i++) {
			pergunta = perguntasFase2.get(i);

			System.out.println(i + " - " + pergunta.pergunta);

			// For para exibir as alternativas
			for (int j = 0; j < pergunta.alternativas.size(); j++) {
				alt = pergunta.alternativas.get(j);

				System.out.println(alt.letra + ") " + alt.texto);
			}

			resposta = reader.next();

			Utilitarios.LimparTela();

			// If que verifica se a resposta digitada foi correta
			// Se nao diminui as vidas restantes
			if (pergunta.RespostaCorreta(resposta.toUpperCase())) {
				// Funcao que exibe a mensagem de vitoria de acordo com o inimigio enfrentado
				ExibirTextoFases(i, true);
			} else {
				System.out.println("Ops!! Resposta Errada \n");
				vidas = vidas - dificuldade;

				// Regressa o i para repetir a mesma pergunta
				i--;

				// Valida se ainda possui vidas para continuar no jogo para
				// Se nao encerra o jogo
				if (!PossuiVidas(vidas)) {
					Utilitarios.LimparTela();

					// Funcao que exibe a mensagem de vitoria de acordo com o inimigio enfrentado
					ExibirTextoFases(i, false);

					return;
				}

				System.out.printf("Ainda restam %d vidas \n \n", vidas);
			}
		}
	}

	public static boolean PossuiVidas(int vidas) {
		return vidas > 0;
	}

	public static void ExibirTextoFases(int fase, boolean correto) throws Exception {
		// Switch que determina qual a mensagem que será exibida de acorod com a fase
		switch (fase) {
			case 1:
				if (correto) {
					Utilitarios.ExibirTexto("Bravo Divergente, falta pouco continue assim e logo alcançara seu objetivo. \n"
							+ "Seu robô está cada vez mais forte enfrente mais robôs e pegue suas peças.");

				} else {
					Utilitarios.ExibirTexto("Não, seu Robô foi destruído, corra, fuja, se esconda. \n"
							+ "Você é nossa única esperança tente novamente, mas não desista.");
				}
				break;

			case 2:
				if (correto) {
					Utilitarios.ExibirTexto(
							"Após uma árdua batalha, finalmente o guardião cai e todas suas peças começam a entrar em curto circuito, afirmando sua derrota. \n"
									+ "Seu próximo desafio o aguarda e está muito próximo, continue divergente.");

				} else {
					Utilitarios.ExibirTexto("Seu Robô foi destruído, mesmo que você corra não irá conseguir fugir, \n"
							+ "não tem como fugir do guardião, não tem como se esconder dele. E nossa última esperança está perdida... \n"
							+ "Ou será que não (Tente novamente) ...");
				}
				break;

			case 3:
				if (correto) {
					Utilitarios.ExibirTexto(
							"Você cai de joelhos, perante o grande robô a sua frente, depois da longínqua batalha você ver um único robô em pé, \n"
									+ "esse robô é a salvação de toda humanidade. Você começa a gritar, um grito que ecoa em toda torre, o alivio se estende em todo seu corpo a libertação está próxima, \n"
									+ "finalmente você pega o chip da máquina mãe e usa para liberta todos os seres humanos que estavam na torre. Finalmente, todos estão livres, você que está no controle \n"
									+ "central e passa um aviso para todos os habitantes que estavam nas fazendas através dos robôs. “Vocês estão livres, irei desligar todos os robôs, essa é nossa vitória.” \n"
									+ "E então todos os robôs começam a cair no chão e agora parece que tudo vai dá certo, parece... \n \n \n"
									+ "FIM... (será) ...");

				} else {
					Utilitarios.ExibirTexto(
							"Você cai de joelhos, perante o grande robô a sua frente, a condenação para humanidade está próxima, "
									+ "a esperança está morta. Não temos mais salvação, a máquina mãe é muito forte não tem como vença-la, você ver o grande robô "
									+ "trucidar o seu robô em meros pedaços e você sente que o seu fim será o mesmo...");
				}
				break;
		}

		Utilitarios.LimparEAguardar();
	}
}
