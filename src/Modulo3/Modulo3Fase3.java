package Modulo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Modulo3Fase3 {

	public static void main(String[] args) {
		
		String ciudad1,ciudad2,ciudad3,ciudad4,ciudad5,ciudad6;
		
		ArrayList<String> lista = new ArrayList<>();
		ArrayList<String> arrayCiutatsModificades = new ArrayList<>();
		
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
				
		for(int i=0 ; i<lista.size(); i++)
		{
			arrayCiutatsModificades.add(i, lista.get(i).replace('a', '4'));
		}
		
		Collections.sort(arrayCiutatsModificades);
		
		System.out.println(arrayCiutatsModificades);

	}

}
