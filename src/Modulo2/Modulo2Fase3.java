package Modulo2;

import java.util.ArrayList;
import java.util.HashMap;

public class Modulo2Fase3 {

	public static void main(String[] args) {
	
		int cont = 0;
		int key = 100;
		
		ArrayList<Character> lista = new ArrayList<>();
		
		lista.add('s');
		lista.add('e');
		lista.add('r');
		lista.add('g');
		lista.add('i');
		lista.add('o');
		lista.add('o');
		
		HashMap<String,String> fasetres = new HashMap<String,String>();
		
		for (int i=0; i < lista.size();i++)
		{
			char letraRepetida = lista.get(i);
			
			for (int j=0; j < lista.size();j++) {
			
				if (lista.get(j) == letraRepetida)
				{
					cont++;
				}
			}
			
			fasetres.put(Integer.toString(key)," " + (lista.get(i) + " = Letra utilizada " + cont + " veces"));			
			cont = 0;
			key++;			
		}	
		
		System.out.println(fasetres);	
	}

}
