package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salario: ");
		String primeiroSalario = teclado.nextLine().replace(",",".");
		
		System.out.print("Digite o segundo salario: ");
		String segundoSalario = teclado.nextLine().replace(",",".");
		
		System.out.print("Difite o terceiro salario: ");
		String terceiroSalario = teclado.nextLine().replace(",",".");
		
		Double media = (Double.parseDouble(primeiroSalario) + Double.parseDouble(segundoSalario) + Double.parseDouble(terceiroSalario)) / 3;
		
		System.out.println(media);
		
		
		teclado.close();
	}

}
