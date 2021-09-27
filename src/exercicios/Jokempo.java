package exercicios;
import java.util.Scanner;
public class Jokempo {

	public static void main(String[] args) {
					
		    int jogador,computador;
		    
		    Scanner teclado = new Scanner(System.in);
		    System.out.println("JOKEMPÔ");
		    System.out.println("1 - Pedra");
		    System.out.println("2 - Papel");
		    System.out.println("3 - Tesoura");
		    System.out.println("Digite a opção desejada:");
		    
		    //Lógica do jogador
		    
		    jogador = teclado.nextInt();
		    switch (jogador) {
		    
		    case 1:
		      System.out.println("Jogador escolheu Pedra");
		      break;
		    case 2:
		    	System.out.println("Jogador escolheu Papel");
		    	break;
		    case 3:
		    	System.out.println("Jogador escolheu Tesoura");
		    	break;
		    	default:
		    		System.out.println("Opção incorreta");
		    		
		    
		    }
		    //Lógica do Computador
		    
		    computador = (int)(Math.random()*3 + 1);	   
		    teclado.close();
		    switch (computador) {
		    
		  
	case 1:
	      System.out.println("Computador escolheu Pedra");
	      break;
	    case 2:
	    	System.out.println("Computador escolheu Papel");
	    	break;
	    case 3:
	    	System.out.println("Computador escolheu Tesoura");
	    	break;
		    }
		    
		    //Lógica para Vencedor
		    
		    if (jogador == computador) {
		    	System.out.println("Empate");
		    }else {
		    	if ((jogador == 1 && computador == 3)|| (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){ 
		    		System.out.println("Jogador Venceu");
		    	}else {
		    		System.out.println("Computador Venceu");
		    	}
		    }
	}

}
