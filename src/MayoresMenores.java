

import java.util.Scanner;


public class MayoresMenores 
{

	public static void main(String[] args) 
	{
		/* Conseguir un numero introducido como referencia, comprobar si los siguientes 10 numeros 
		 * -que serán tambien introducidos por teclado- son mayores, menores o iguales.
		 * [Versión Bucles, NO HACER hasta ver Estructuras de Control Repetitivas] En el caso de ser
		 *  igual, terminar el programa.*/
		
Scanner entrada = new Scanner(System.in);
		
		int numeroReferencia=0;
		System.out.println("Introduzca un numero de referencia: ");
		numeroReferencia = entrada.nextInt();
		
	
		System.out.println();
		

		int numeroUno=0;
		System.out.println("Introduzca un 1 numero aleatorio: ");
		numeroUno = entrada.nextInt();
		if(numeroUno == numeroReferencia)
		{
			System.out.println("El numero 1 es igual que el numero de referencia.");
					
		}
		else if (numeroUno > numeroReferencia)
			{
				System.out.println("El numero 1 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 1 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroDos=0;
		System.out.println("Introduzca un 2 numero aleatorio ");
		numeroDos = entrada.nextInt();
		if(numeroDos == numeroReferencia)
		{
			System.out.println("El numero 2 es igual que el numero de referencia.");
					
		}
		else if (numeroDos > numeroReferencia)
			{
				System.out.println("El numero 2 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 2 es menor que el numero de referencia.");
			
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroTres=0;
		System.out.println("Introduzca un 3 numero aleatorio: ");
		numeroTres = entrada.nextInt();
		if(numeroTres == numeroReferencia)
		{
			System.out.println("El numero 3 es igual que el numero de referencia.");
					
		}
		else if (numeroTres > numeroReferencia)
			{
				System.out.println("El numero 3 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 3 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroCuatro=0;
		System.out.println("Introduzca un 4 numero aleatorio: ");
		numeroCuatro = entrada.nextInt();
		if(numeroCuatro == numeroReferencia)
		{
			System.out.println("El numero 4 es igual que el numero de referencia.");
					
		}
		else if (numeroCuatro > numeroReferencia)
			{
				System.out.println("El numero 4 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 4 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroCinco=0;
		System.out.println("Introduzca un 5 numero aleatorio: ");
		numeroCinco = entrada.nextInt();
		if(numeroCinco == numeroReferencia)
		{
			System.out.println("El numero 5 es igual que el numero de referencia.");
					
		}
		else if (numeroCinco > numeroReferencia)
			{
				System.out.println("El numero 5 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 5 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroSeis=0;
		System.out.println("Introduzca un 6 numero aleatorio: ");
		numeroSeis = entrada.nextInt();
		if(numeroSeis == numeroReferencia)
		{
			System.out.println("El numero 6 es igual que el numero de referencia.");
					
		}
		else if (numeroSeis > numeroReferencia)
			{
				System.out.println("El numero 6 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 6 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroSiete=0;
		System.out.println("Introduzca un 7 numero aleatorio: ");
		numeroSiete = entrada.nextInt();
		if(numeroSiete == numeroReferencia)
		{
			System.out.println("El numero 7 es igual que el numero de referencia.");
					
		}
		else if (numeroSiete > numeroReferencia)
			{
				System.out.println("El numero 7 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 7 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroOcho=0;
		System.out.println("Introduzca un 8 numero aleatorio: ");
		numeroOcho = entrada.nextInt();
		if(numeroOcho == numeroReferencia)
		{
			System.out.println("El numero 8 es igual que el numero de referencia.");
					
		}
		else if (numeroOcho > numeroReferencia)
			{
				System.out.println("El numero 8 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 8 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroNueve=0;
		System.out.println("Introduzca un 9 numero aleatorio: ");
		numeroNueve = entrada.nextInt();
		if(numeroNueve == numeroReferencia)
		{
			System.out.println("El numero 9 es igual que el numero de referencia.");
					
		}
		else if (numeroNueve > numeroReferencia)
			{
				System.out.println("El numero 9 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 9 es menor que el numero de referencia.");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		int numeroDiez=0;
		System.out.println("Introduzca un 10 numero aleatorio: ");
		numeroDiez = entrada.nextInt();
		if(numeroDiez == numeroReferencia)
		{
			System.out.println("El numero 10 es igual que el numero de referencia.");
					
		}
		else if (numeroSiete > numeroReferencia)
			{
				System.out.println("El numero 10 es mayor que el numero de referencia.");
			}
		
		else
		{
			System.out.println("El numero 10 es menor que el numero de referencia.");
		}
		
		
entrada.close();
	}

}
