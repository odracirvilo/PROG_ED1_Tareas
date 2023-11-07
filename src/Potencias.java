import java.util.Scanner;

public class Potencias 
{

	public static void main(String[] args)
	{
		/*Realizar un programa java que calcule potencias a partir de una base y un exponente, 
		 limitado a 5 (en el exponente). En caso de que el exponente sea 0 o menor el resultado 
		 sera 1. En caso de que la base sea 0 o menor el resultado sera 1. 
		 *[v2] esta permitido utilizar bucles y exponente ilimitado (solamente tras ver bucles), 
		 realizar este calculo de potencias hasta que el usuario introduzca exponente y  base (-1)*/

		Scanner entrada = new Scanner(System.in);
		
		int base = 0;
		int exponente = 0;
		
		System.out.println("Introducir el numero Base: ");
		base = entrada.nextInt();
			
		System.out.println("Introducir el numero exponente: ");
		exponente = entrada.nextInt();
		
		if (exponente <= 0 || base <= 0)
				{
				System.out.println("El resultado = 1");
				}
		else if (exponente == 1)
		        {
				System.out.println("El resultado es = " + (base));
		        }
		else if (exponente == 2)
        		{
				System.out.println("El resultado es = " + (base*base));
        		}
		else if (exponente == 3)
				{
				System.out.println("El resultado es = " + (base*base*base));
				}
		else if (exponente == 4)
				{
				System.out.println("El resultado es = " + (base*base*base*base));
				}
		else if (exponente == 5)
				{
				System.out.println("El resultado es = " + (base*base*base*base*base));
				}
		
		entrada.close();
		
	}

}
