package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Pergunta;

public class App {	

	
	public static void main (String[] args ) throws IOException {		
		
		 Scanner entrada = new Scanner (System.in);
	      
		   String menu;
		  
		   
		  
		   boolean errado = true;
		   
		   do {  
			   
			   System.out.println ("    MENU ");
		   //
		   System.out.println ("<1> Instru�oes");
		   //
		   System.out.println ("<2> Jogar ");
		   //
		   System.out.println ("<3> Cr�ditos ");
		   //
		   System.out.println ("<4> Sair   ");
		   
		   
		   
		   
		   
			  menu = entrada.next();
			  
			  int contador = 3;
			  
			  switch (menu) {
			  
			   case "1":
			    System.out.println("mecanismo e introdu�ao do jogo, o jogo consiste em acerta perguntas, "
			    		+ "de acordo com seus acertos voce ganha, voce equipa pe�as com niveis mais altos "
			    		+ " e seu objetivo de salvar a vida da ra�a humana se aproxima"
			    		+ "Perguntas para a montagem do rob� (5 perguntas voltadas aos componentes do PC).\r\n"
			    		+ "Cada pergunta respondida errada nesta fase, voc� perder� o m�ximo de vidas dispon�veis. "
			    		+ "Perguntas para enfrentar os inimigos (3 a 5 perguntas).\r\n"
			    		+ "Sistema de vidas, quando errar perde de acordo com a dificuldade."
			    		+  "N�vel de dificuldade;"

                        + "- F�cil - Perguntas f�ceis, perdendo 1 vida;"

                        + " - M�dio - Perguntas m�dias, perdendo 1 vida;"

                        + "- Dif�cil - Perguntas dif�ceis, perdendo 2 vidas.");
			    
			    System.out.println(" menos " + (2-contador) + " chance" + " restam " + 2 + " chances" );
				   break;
				   
			   case "2":
<<<<<<< HEAD
			          Jogar();
=======
				   Jogar();
>>>>>>> 94cb0afc51d74c291516bae656f080d7068c4d40
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
			    System.out.println("Saiu. ");
			    errado = false;
				   break; 
				   
			  
			   default:    	     
		 	    System.out.println("Resposta Inv�lida");
		 		   break;
		 		   
			     
		 		   
			   }
			  
<<<<<<< HEAD
		   }  while (errado);
		   
		 
	 		   
	 		   
		     
	 		   
		   
		   
		   

}
	public static void Jogar () {
		 System.out.println("Jogando...");
	}
	
}
=======
		   }  while (errado);	
	}
>>>>>>> 94cb0afc51d74c291516bae656f080d7068c4d40
	
	public static void Jogar() throws IOException {
		System.out.println("Oi");
	}	
}