import java.util.Scanner;

public class MayoresMenoresv2 {

	public static void main(String[] args) 
	{
		/* Conseguir un numero introducido como referencia, comprobar si los siguientes 10 numeros 
		 * -que serán tambien introducidos por teclado- son mayores, menores o iguales.
		 * [Versión Bucles, NO HACER hasta ver Estructuras de Control Repetitivas] En el caso de ser
		 *  igual, terminar el programa.*/
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroAleatorio = 0;
		int numeroReferencia = 0;
		
		System.out.println("Introduzca un numero de referencia: ");
		numeroReferencia = entrada.nextInt();
		
		System.out.println();
		
		for( int i = 1; i <= 10; i++)
		{
			System.out.println("Introduzca un numero aleatorio:" + i + ":");
			numeroAleatorio = entrada.nextInt();
			
			if(numeroAleatorio > numeroReferencia)
			{
				System.out.println("El numero  es mayor que el numero de referencia.");
						
			}
			else if (numeroAleatorio < numeroReferencia)
				{
					System.out.println("El numero es menor que el numero de referencia.");
				}
			
			else
			{
				System.out.println("El numero es igual que el numero de referencia.");
				break;
			}
			
		}
		
		entrada.close();
	}
	

}
