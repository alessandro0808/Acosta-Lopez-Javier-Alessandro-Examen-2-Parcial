import java.util.Scanner;
	public class Ejercicio8{
	public static void main(String args[]){
	double ahorro=500;
	double interes=0;
	
	for(int a=1; a<13;a++){
	interes= Math.round(ahorro*1.09);
	System.out.println("Ahorro del mes " + a + " con la tasa de interes del 9%  es de:" +interes );
	ahorro=interes+500;
	}



}
} 