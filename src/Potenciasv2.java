import java.util.Scanner;

public class Potenciasv2 {

	public static void main(String[] args) {
		/*Realizar un programa java que calcule potencias a partir de una base y un exponente, 
		 limitado a 5 (en el exponente). En caso de que el exponente sea 0 o menor el resultado 
		 sera 1. En caso de que la base sea 0 o menor el resultado sera 1. 
		 *[v2] esta permitido utilizar bucles y exponente ilimitado (solamente tras ver bucles), 
		 realizar este calculo de potencias hasta que el usuario introduzca exponente y  base (-1)*/

		Scanner entrada = new Scanner(System.in);
		
		int numeroBase = 0;
		int numeroExponente = 0;
		int producto = 1;
		
		for (int i=0; i<50; i++)
		{
		System.out.println("Introducir el numero base: ");
		numeroBase = entrada.nextInt();
		
		System.out.println();
		
		System.out.println("Introducir el numero exponente: ");
		numeroExponente = entrada.nextInt();
		}
		
		if (numeroBase != -1 || numeroExponente != -1)
		{
			for (int j = 1; j <= numeroExponente; j++) 
		    {
			producto = producto*numeroBase;		 
	        }	
			System.out.println("La potencia es:" + producto);
		}
		else
		{
			System.out.println("El usuario ha introducido el exponente y la base igual a -1.");	
		}
		
	
		
		
			
		/*SOLO CON WHILE
		while(numeroExponente != 0)
		{
			producto = producto*numeroBase;
			numeroExponente--;
		}
		System.out.println("La potencia es :" + producto);*/
			
		entrada.close();
		
	}

}
