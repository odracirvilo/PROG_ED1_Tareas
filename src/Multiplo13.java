import java.util.Scanner;

public class Multiplo13 

{

	public static void main(String[] args)
	{
		/* Programa que a partir de un numero entero nos imprima por consola si ese numero es 
		 * múltiplo de 13, o no.
		 * [v2] + si ese numero es múltiplo de X, o no. (Dónde X lo introduce el usuario)*/
		 
		Scanner entrada = new Scanner(System.in);
		
		int numeroAleatorio = 0;
		System.out.println("Introduzca un numero aleatorio: ");
		numeroAleatorio = entrada.nextInt();
		double resultado = 0;
		resultado = numeroAleatorio % 13;
		
		if(resultado == 0)
		{
			System.out.println("El numero aleatorio SI es multiplo de 13.");
		}
		else
		{
			System.out.println("El numero aleatorio NO es multiplo de 13.");
		}	
		
entrada.close();
	}

}
