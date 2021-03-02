
public class Module1Fase3 {

	public static void main(String[] args) {
		
		int any = 1992;
		int anybisiesto; 
		byte cadacuanto = 4; 
		boolean bisSi = false;
		String frase1 = "El año de nacimiento es bisiesto";
		String frase2 = "El año de nacimiento no es bisiesto";
		
	
		for (anybisiesto=1948; anybisiesto < any ; anybisiesto+=cadacuanto)
		{
			System.out.println(anybisiesto);			
		}
		
		if((anybisiesto) == any)
			bisSi = true;
		else
			bisSi = false;
		
		
		if (bisSi==true)
		{
			System.out.println(frase1);
		}else
		{
			System.out.println(frase2);
		}
	}

}
