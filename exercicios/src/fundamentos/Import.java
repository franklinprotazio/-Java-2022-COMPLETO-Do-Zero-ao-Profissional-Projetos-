package fundamentos;

import java.util.Date;
import java.util.Scanner;

public class Import {

	public static void main(String[] args) {
//		java.lang.String b = "Boa tarde!";
//		java.lang.System.out.println(b);
//		
//		String s = "Bom dia!!";
//		System.out.println(s);
//		
//		Date d = new Date();
//		System.out.println(d);	
		
		// JButton botao = new JButton();
		
		Scanner teclado = new Scanner(System.in);
		 
	    System.out.print("Qual a sua idade?");
	    int idade = teclado.nextInt();
	//    teclado.nextLine(); //lê o "\\\\n" que o teclado.nextInt() deixa para trás.

	    System.out.print("Qual o seu nome?");
	    String nome = teclado.nextLine();
	    System.out.print("Qual o seu sobrenome?");
	    String sobrenome = teclado.nextLine();
	 
	    teclado.close();
		
	}

}
