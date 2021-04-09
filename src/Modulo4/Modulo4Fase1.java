package Modulo4;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.jdi.InternalException;

public class Modulo4Fase1 {

	public static void main(String[] args) {
		
		int mCinco = 5;
		int mDiez = 10;
		int mVeinte = 20;
		int mCincuenta = 50;
		int mCien = 100;
		int mDoscientos = 200;
		int mQuinientos = 500;
		int[] billetes = new int[10];
		int total=0;
		boolean next;
		
		int[] precioPlato = new int[5];
		String[] menu = new String[5];
		
		menu[0] = "1.Macarrones";
		menu[1] = "2.Pure";
		menu[2] = "3.Acelgas";
		menu[3] = "4.Arroz cubano";
		menu[4] = "5.Ensalada";
		
		precioPlato[0] = 5;
		precioPlato[1] = 10;
		precioPlato[2] = 15;
		precioPlato[3] = 20;
		precioPlato[4] = 25;
		
		do {
			try {
				Scanner entrada=new Scanner(System.in);
				System.out.println("Que quieres comer de esta lista, selecciona con un número: ");
				for (int i = 0 ; i<=4;i++)
					System.out.println(menu[i]);
				next = false;
				int num =entrada.nextInt();
				if(num>5) {
					next = true;
					System.out.println("El numero del plato no esta en la lista");
				}				
				else					
					total = total + precioPlato[num-1];
			}catch(InputMismatchException ex){
				System.out.println("No ha introducido un número");
				next = true;
			}	

        } while (next);
		
		System.out.println("El precio total del menu es:" + total);	
		
		while(total>0)
		{
			while(total-mQuinientos>=0) {
				total=total-mQuinientos;
				billetes[0]++;
			}
			while(total-mDoscientos>=0) {
				total=total-mDoscientos;
				billetes[1]++;
			}
			while(total-mCien>=0) {
				total=total-mCien;
				billetes[2]++;
			}
			while(total-mCincuenta>=0) {
				total=total-mCincuenta;
				billetes[3]++;
			}
			while(total-mVeinte>=0) {
				total=total-mVeinte;
				billetes[4]++;
			}
			while(total-mDiez>=0) {
				total=total-mDiez;
				billetes[5]++;
			}
			while(total-mCinco>=0) {
				total=total-mCinco;
				billetes[6]++;
			}
			
		}
		
		for(int i=0;i<9;i++)
		{
			if(i==0 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 500");
			if(i==1 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 200");
			if(i==2 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 100");
			if(i==3 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 50");
			if(i==4 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 20");
			if(i==5 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 10");
			if(i==6 && billetes[i]!= 0)
				System.out.println(billetes[i] + " billetes de 5");
			
		}
	}

}
