import java.util.Scanner;
public class testeWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("todos os numeros Digitados seram Somados ate que digite 0:  ");
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x;
			
			System.out.println("digite outro numero: ");
			x = sc.nextInt();
			
		}
		System.out.println("A soma dos numeros: " + soma);
		sc.close();
	}
	

}
