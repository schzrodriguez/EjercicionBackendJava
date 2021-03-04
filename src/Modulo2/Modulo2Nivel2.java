package Modulo2;

public class Modulo2Nivel2 {
	
	public static void main(String[] args) {
		
		int altura = 5;
		int alturapiramide = 5;
				
		for(int i=1; i<=altura ; i++) {
			
			for(int j=1; j<=i ;j++) {
					System.out.print(j);
			}
			System.out.println("");
		}
		
		for(int espacios = 0, ast = (alturapiramide*2)-1; ast>0; espacios++, ast -= 2){          
            
			for(int i=0; i < espacios; i++){
                System.out.print(" ");
            }

            for(int j=ast; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
		}
		
	}
}
