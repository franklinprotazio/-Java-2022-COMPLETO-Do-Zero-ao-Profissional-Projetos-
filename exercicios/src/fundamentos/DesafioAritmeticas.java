package fundamentos;

public class DesafioAritmeticas {

	public static void main(String[] args) {
		
		// Como eu fiz
		
//		int a = 3+2;
//		int b = 6 * a;
//		int c = (int) Math.pow(b, 2);
//		int d = 3*2;
//		int e = c/d;
//		System.out.println(e);
//		int f = 1-5;
//		int g = 2-7;
//		int h = f * g;
//		int i = h / 2;
//		int j = (int) Math.pow(i, 2);
//		System.out.println(j);
//		int k = e - j;
//		System.out.println(k);
//		int l = (int) Math.pow(k, 3);
//		int m = (int) Math.pow(10, 3);
//		int n = l/m;
//		System.out.println(n);
//		
		// Como o professor fez
		
		System.out.println("---------------------------");
		
		double numA = Math.pow(6 * (3 +2 ), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superioA = numA / denA;

		double superioB = Math.pow(numB / denB,  2 );
		
		double superior = Math.pow(superioA - superioB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		System.out.println("O resultado eh: " + resultado);
				

	}

}
