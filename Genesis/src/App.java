
import java.util.Scanner;

public class App {

	
	public static void main (String[] args ) {
		
		 Scanner entrada = new Scanner (System.in);
	      
		   String menu;
		  
		   
		  
		   boolean errado = true;
		   
		   do {  
			   
			   System.out.println ("    MENU ");
		   //
		   System.out.println ("<1> Instruçoes");
		   //
		   System.out.println ("<2> Jogar ");
		   //
		   System.out.println ("<3> Créditos ");
		   //
		   System.out.println ("<4> Sair   ");
		   
		   
		   
		   
		   
			  menu = entrada.next();
			  
			  int contador = 3;
			  
			  switch (menu) {
			  
			   case "1":
			    System.out.println("mecanismo e introduçao do jogo, o jogo consiste em acerta perguntas, "
			    		+ "de acordo com seus acertos voce ganha, voce equipa peças com niveis mais altos "
			    		+ " e seu objetivo de salvar a vida da raça humana se aproxima"
			    		+ "Perguntas para a montagem do robô (5 perguntas voltadas aos componentes do PC).\r\n"
			    		+ "Cada pergunta respondida errada nesta fase, você perderá o máximo de vidas disponíveis. "
			    		+ "Perguntas para enfrentar os inimigos (3 a 5 perguntas).\r\n"
			    		+ "Sistema de vidas, quando errar perde de acordo com a dificuldade."
			    		+  "Nível de dificuldade;"

                        + "- Fácil - Perguntas fáceis, perdendo 1 vida;"

                        + " - Médio - Perguntas médias, perdendo 1 vida;"

                        + "- Difícil - Perguntas difíceis, perdendo 2 vidas.");
			    
			    System.out.println(" menos " + (2-contador) + " chance" + " restam " + 2 + " chances" );
				   break;
				   
			   case "2":
			    System.out.println("Jogando...");
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
		 	    System.out.println("Resposta Inválida");
		 		   break;
		 		   
			     
		 		   
			   }
			  
		   }  while (errado);
		   
		 
	 		   
	 		   
		     
	 		   
		   
		   
		   

}
	
}
	
