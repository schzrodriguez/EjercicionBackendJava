package Modulo2;

import java.util.ArrayList;

public class Modulo2Fase4 {

	public static void main(String[] args) {
		
		ArrayList<Character> nombre = new ArrayList<>();
		ArrayList<Character> apellido = new ArrayList<>();
		ArrayList<Character> fusion = new ArrayList<>();
		
		nombre.add('s');
		nombre.add('e');
		nombre.add('r');
		nombre.add('g');
		nombre.add('i');
		nombre.add('o');
		
		apellido.add('s');
		apellido.add('a');
		apellido.add('n');
		apellido.add('c');
		apellido.add('h');
		apellido.add('e');
		apellido.add('z');

		for(int i=0; i < nombre.size(); i++)
			fusion.add(nombre.get(i));
		fusion.add(' ');
		for(int i=0; i < apellido.size(); i++)
			fusion.add(apellido.get(i));
		
		System.out.println(fusion);

	}

}
