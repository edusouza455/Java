import java.util.Scanner;

public class testeFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		
      //for (Inicio; condicao; incremento)
		
		for (int i=0; i<N; i++) { 
			int x = sc.nextInt();
			soma = soma + x;
			System.out.println("valor do I: " + i);
		}
		
		System.out.println(soma);
		sc.close();

	}

}
