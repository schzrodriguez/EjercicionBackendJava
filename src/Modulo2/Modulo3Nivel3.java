package Modulo2;

import java.util.Formatter;

public class Modulo3Nivel3 {
	
	public static void main(String[] args) throws InterruptedException {
	
		int horas=23;
		int minutos=59;
		int segundos=55;
		
		
		
		while(true)
		{
			Formatter fmtsegundos = new Formatter();
			Formatter fmtminutos = new Formatter();
			Formatter fmthoras= new Formatter();
			fmtsegundos.format("%02d",segundos);
			fmtminutos.format("%02d",minutos);
			fmthoras.format("%02d",horas);
		
			System.out.println(fmthoras + ":" + fmtminutos + ":" + fmtsegundos);
			Thread.sleep(1000);
			segundos++;
			if(segundos==60)
			{

				minutos++;
				segundos=0;
				if(minutos==60)
				{
					horas++;
					if(horas>23)
					{
						horas=0;
					}
					minutos=0;
				}		
			}			
		}
		
	}
	
	

}
