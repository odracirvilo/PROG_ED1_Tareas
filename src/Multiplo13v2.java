import java.util.Scanner;

public class Multiplo13v2

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
		
		int numeroMultiplo =0;
		System.out.println("Determinar si es multiplo de:");
		numeroMultiplo = entrada.nextInt();
		
		double resultado = 0;
		resultado = numeroAleatorio % numeroMultiplo;
		
		if(resultado == 0)
		{
			System.out.println("El numero aleatorio ¡SI! es multiplo del segundo numero.");
		}
		else
		{
			System.out.println("El numero aleatorio ¡NO! es multiplo del segundo numero.");
		}	
		
entrada.close();
	}

}
