
public class Modulo1Fase4 {

	public static void main(String[] args) {
		
		String nom, cognom1, cognom2, nombreCompleto, fechaNacimiento;
		String frase1 = "El año es bisiesto";
		String frase2 = "El año no es bisiesto";
		
		int dia, mes, any;
		
		nom = "Sergio";
		cognom1 = "Sanchez";
		cognom2 = "Rodriguez";
		dia = 8;
		mes = 8;
		any = 1992;
		
		nombreCompleto = nom + " " + cognom1 + " " + cognom2;	
		fechaNacimiento = dia + "/" + mes + "/" + any;
		
		System.out.println("El meu nom és " +  nombreCompleto);		
		System.out.println("Vaig néxier el " + fechaNacimiento);
		System.out.println("El meu any de naixement és de traspàs");
		
		
	}

}
