
public class Modulo1Fase4 {

	public static void main(String[] args) {
		
		String nom, cognom1, cognom2, nombreCompleto, fechaNacimiento;
		String frase1 = "El a�o es bisiesto";
		String frase2 = "El a�o no es bisiesto";
		
		int dia, mes, any;
		
		nom = "Sergio";
		cognom1 = "Sanchez";
		cognom2 = "Rodriguez";
		dia = 8;
		mes = 8;
		any = 1992;
		
		nombreCompleto = nom + " " + cognom1 + " " + cognom2;	
		fechaNacimiento = dia + "/" + mes + "/" + any;
		
		System.out.println("El meu nom �s " +  nombreCompleto);		
		System.out.println("Vaig n�xier el " + fechaNacimiento);
		System.out.println("El meu any de naixement �s de trasp�s");
		
		
	}

}
