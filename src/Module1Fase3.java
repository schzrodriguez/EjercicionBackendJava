
public class Module1Fase3 {

	public static void main(String[] args) {
		
		int any = 1992;
		int anybisiesto = 1948; 
		byte cadacuanto = 4; 
		boolean bisSi = true;
		String frase1 = "El año es bisiesto";
		String frase2 = "El año no es bisiesto";
		
		for (int i; anybisiesto <= any ; anybisiesto+=cadacuanto)
		{
			System.out.println(anybisiesto);
		}
		
		if (bisSi==true)
		{
			System.out.println(frase1);
		}else
		{
			System.out.println(frase2);
		}

	}

}
