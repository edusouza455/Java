import java.util.Scanner;

public class testinputs {	
	    public static void main(String[] args) {
	    	
	        Scanner entrada = new Scanner(System.in);
	    	
	        // numero float
	        System.out.print("Digite um numero: ");
	        float myFloat = entrada.nextFloat();
	        System.out.println("numero fluatante = " + myFloat);
	    	
	        // numero double
	        System.out.print("Digite um numero: ");
	        double myDouble = entrada.nextDouble();
	        System.out.println("numero double = " + myDouble);
	    	
	        // entrada de texto
	        System.out.print("digite algo: ");
	        String myString = entrada.next();
	        System.out.println("Ta certo = " + myString);
	    }


}
