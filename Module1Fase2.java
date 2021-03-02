
public class Module1Fase2 {
	
	public static void main(String[] args) {
		
		int resultado = 0;
			
		int any = 1992;
		final int anybisiesto = 1948;  //Final es una constante en Java
		byte cadacuanto = 4; 
		
		for (int i = anybisiesto; i <  any ; i+=cadacuanto)
		{
			resultado = resultado + 1;
		}
			
		System.out.println(resultado);
	}

}
