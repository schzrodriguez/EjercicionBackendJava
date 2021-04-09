package Modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;


public class Modulo4Fase2 {

	public static void main(String[] args) {
		
			int mUno = 1;
			int mDos = 2;
			int mCinco = 5;
			int mDiez = 10;
			int mVeinte = 20;
			int mCincuenta = 50;
			int mCien = 100;
			int mDoscientos = 200;
			int mQuinientos = 500;
			int[] billetes = new int[10];
			int total=0;
			int contador = 0;
			boolean next;
			boolean next2;
			
			int[] precioPlato = new int[10];
			String[] menu = new String[10];
			
			HashMap<String, Integer> preuPlat = new HashMap<String, Integer>();
			ArrayList<String> pedidoCliente = new ArrayList<String>();
			
			preuPlat.put("Bufalina", 12);
			preuPlat.put("4 Formaggi", 12);
			preuPlat.put("Pino Daniele", 18);
			preuPlat.put("Margherita", 9);
			preuPlat.put("Prosciutto", 10);
			preuPlat.put("Parmiggiana", 11);
			preuPlat.put("Al tonno", 13);
			preuPlat.put("Carbonara", 11);
			preuPlat.put("Massimo Troise", 17);
			preuPlat.put("Ortolana", 12);
			
			for(Map.Entry<String, Integer> entry :preuPlat.entrySet()) {
				menu[contador] = entry.getKey();
				precioPlato[contador]= entry.getValue();
				contador++;
			}
							
			do {
					Scanner entrada=new Scanner(System.in);
					System.out.println("Que quieres comer");
					for (int i = 0 ; i<=9;i++)
						System.out.println(menu[i]);
					next = false;
					String plato = entrada.nextLine();
					
					if(!Arrays.asList(menu).contains(plato))
					{
						next = true;
						System.out.println("El plato no esta en la lista");
					}else
					{
						pedidoCliente.add(plato);
						do
						{
							System.out.println("¿Quieres otro plato mas? 1:Si");
							try
							{
								Scanner entrada2=new Scanner(System.in);
								int sino = entrada2.nextInt();
								if(sino==1)
								{
									next = true;
								}else
									next = false;
										
								next2 = false;
							}catch(InputMismatchException ex){
								System.out.println("No ha introducido un número");
								next2 = true;
							}
						}while(next2);
					}
	        } while (next);
			
			int numPlatos = pedidoCliente.size();
			
			System.out.println(numPlatos);		
			
			while (numPlatos > 0)
			{
				total = total + preuPlat.get(pedidoCliente.get(numPlatos-1));
				numPlatos--;
			}
			
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
				while(total-mDos>=0) {
					total=total-mDos;
					billetes[7]++;
				}
				while(total-mUno>=0) {
					total=total-mUno;
					billetes[8]++;
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
				if(i==7 && billetes[i]!= 0)
					System.out.println(billetes[i] + " monedas de 2");
				if(i==8 && billetes[i]!= 0)
					System.out.println(billetes[i] + " monedas de 1");
				
			}
		
		}

}
