package Modulo3;

import java.util.Scanner;

public class Modulo3Nivel3 {

	    public static void main(String[] args){
	 
	        Scanner sc = new Scanner(System.in);
	        int numero,fibo1,fibo2,i;
	  
	        System.out.print("Introduce numero: ");
	        numero = sc.nextInt();
	        System.out.println("Fibonacci:");                 

	        fibo1=0;
	        fibo2=1;

	        System.out.print(fibo1 + " ");
	        for(i=2;i<=numero;i++){
	            System.out.print(fibo2 + " ");
	            fibo2 = fibo1 + fibo2;
	            fibo1 = fibo2 - fibo1;
	        }
	        System.out.println();
	    }
}

