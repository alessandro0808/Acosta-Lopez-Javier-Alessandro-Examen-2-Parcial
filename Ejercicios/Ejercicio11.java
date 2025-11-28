import java.util.Scanner;
	public class Ejercicio11{
	public static void main(String args[]){
	double num[]= new double[8];
	Scanner sc = new Scanner(System.in);
	int dentro=0;
	System.out.println("Ingresa 8 números al azar");
	for(int a=0; a<8; a++){
		num[a]=sc.nextDouble();
		}
		System.out.println("Dame un numero para buscarlo dentro del vector: ");
		double num1=sc.nextDouble();
		for(int a=0; a<8; a++){
			if(num1==num[a]){
				dentro=1;
			}
			}	
				if(dentro==1){
				System.out.println("El numero que me diste se encuentra dentro del vector");
				}
				else {
				System.out.println("El numero que me diste no se encuentra dentro del vector");
				}	
		
}
}