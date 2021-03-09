package Modulo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Modulo3Fase4 {

	public static void main(String[] args) {
		
		String ciudad1,ciudad2,ciudad3,ciudad4,ciudad5,ciudad6;
		
		ArrayList<String> lista = new ArrayList<>();

		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe el nombre de la ciudad 1 ciudad: ");
		ciudad1=entrada.nextLine();
		System.out.println("Escribe el nombre de la ciudad 2 ciudad: ");
		ciudad2=entrada.nextLine();
		System.out.println("Escribe el nombre de la ciudad 3 ciudad: ");
		ciudad3=entrada.nextLine();
		System.out.println("Escribe el nombre de la ciudad 4 ciudad: ");
		ciudad4=entrada.nextLine();
		System.out.println("Escribe el nombre de la ciudad 5 ciudad: ");
		ciudad5=entrada.nextLine();
		System.out.println("Escribe el nombre de la ciudad 6 ciudad: ");
		ciudad6=entrada.nextLine();
		
		lista.add(ciudad1);
		lista.add(ciudad2);
		lista.add(ciudad3);
		lista.add(ciudad4);
		lista.add(ciudad5);
		lista.add(ciudad6);	
		
		String[] arrayCiutats = new String[lista.size()];
		String[] arrayCiutatsInvertido= new String[lista.size()];
				
		for (int i=0; i<lista.size(); i++) 
		{
			arrayCiutats[i] = lista.get(i);
			arrayCiutatsInvertido[i] = "";
			for (int j=arrayCiutats[i].length()-1; j>=0; j--) 
			{
				arrayCiutatsInvertido[i] = arrayCiutatsInvertido[i] + arrayCiutats[i].charAt(j);			
			}	
			System.out.println(arrayCiutatsInvertido[i]);
		}
			
		
	}

}
