import java.util.Scanner;
	public class Ejercicio10{
	public static void main(String args[]){
	double num[]= new double[10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingresa 10 numeros");
	for(int a=0; a<10; a++){
		num[a]=sc.nextDouble();
		}
		System.out.println("Los números con orden inverso son: ");
		for(int a=9; a>=0; a--){
		System.out.println(num[a]);
		}
}
}
