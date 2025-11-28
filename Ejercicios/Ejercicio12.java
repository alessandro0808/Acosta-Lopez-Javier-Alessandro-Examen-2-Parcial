import java.util.Scanner;
	public class Ejercicio12{
	public static void main(String args[]){
	double dias[]= new double[7];
	Scanner sc = new Scanner(System.in);
	double total=0;
	double mayor=0;
	int b=1;
	System.out.println("Ingresa la venta");
	for(int a=0; a<7; a++){
		System.out.println("Dia " +b);
		dias[a]=sc.nextDouble();
		total=total+dias[a];
		b++;
		}
		for(int a=0; a<7; a++){
			if(dias[a]>=mayor){
			mayor=dias[a];
			}
		}
		System.out.println("La venta total de la semana es de: " +total);
		System.out.println("La venta mayor es de: " +mayor);
		

	}
}
