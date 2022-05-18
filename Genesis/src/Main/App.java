package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Pergunta;

public class App {	

	
	public static void main (String[] args ) throws IOException {		
		
		 Scanner entrada = new Scanner (System.in);
	      
		   String menu;
		  
		   String nome, nrobo;
		  
		   boolean errado = true;
		   
		   do {  
			   
			   System.out.println (" -- MENU -- ");
		   //
		   System.out.println ("<1> Instrucoes");
		   //
		   System.out.println ("<2> Jogar");
		   //
		   System.out.println ("<3> Creditos");
		   //
		   System.out.println ("<4> Sair");
		   
		   
		   
		   
		   
			  menu = entrada.next();
			  
			  int contador = 3;
			  
			  switch (menu) {
			  
			   case "1":
			    System.out.println("Mecanismo e introducao do jogo: "
			    		+ "O jogo consiste em acerta perguntas, com cada acerto voce ganha pecas do robo."
			    		+ "Seu objetivo é salvar a humanidade do controle dos Robos e vencer a CPU mae."
			    		+ "Serao 5 perguntas voltadas aos componentes do PC, para montagem do robo. \r\n"
			    		+ "Cada pergunta respondida errada nesta fase, voce perdera o maximo de vida disponivel. "
			    		+ "E tera perguntas para enfrentar os inimigos.\r\n"
			    		+ "Cada resposta errada sera como um dano que o inimigo ira te dar."
			    		
			    		+ "Niveis de dificuldades;"

                        + "- Facil - Perguntas faceis, perdendo 1 vida;"

                        + "- Medio - Perguntas medias, perdendo 1 vida;"

                        + "- Dificil - Perguntas dificeis, perdendo 2 vidas.");
			    
			    System.out.println(" menos " + (2-contador) + " chance" + " restam " + 2 + " chances" );
				   break;
				   
			   case "2":
			          Jogar();
			          nome = entrada.next();
				   break; 
			    
			   case "3":	    	      
			    System.out.println("SENAC "
			    		+ "Cleyton Silva" 
			    		+ "Felipe Maya " 
			    		+ "Felipe Santos " 
			    		+ "professor Takeo "
			    		);
				   break;
				   
			   case "4":	    	      
			    System.out.println("Saiu.");
			    errado = false;
				   break; 
				   
			  
			   default:    	     
		 	    System.out.println("Resposta Invalida");
		 		   break;
		 		   
			     
		 		   
			   }
			  
		   }  while (errado);
		   
		
		    

}
	public static void Jogar () {
		 System.out.println("Jogando...");
		 System.out.print("Digite seu nome:\n ");
	}
	
}
