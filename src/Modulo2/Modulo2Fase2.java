package Modulo2;

import java.util.ArrayList;

public class Modulo2Fase2 {

	public static void main(String[] args) {
		
		ArrayList<Character> lista = new ArrayList<>();
		
		lista.add('s');
		lista.add('e');
		lista.add('r');
		lista.add('g');
		lista.add('i');
		lista.add('o');
		lista.add('2');
		
		
		
		for (int i=0; i < lista.size();i++)
		{
			if (Character.isDigit(lista.get(i)))
				System.out.println("UN NUMERO NO ES PARTE DE UN NOMBRE");
			else if (lista.get(i)=='a'||lista.get(i)=='e'||lista.get(i)=='i'||lista.get(i)=='o'||lista.get(i)=='u')
				System.out.println("VOCAL");
			else
				System.out.println("CONSONANTE");
		}		
	}
}
