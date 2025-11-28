import java.util.Scanner;
class Ejercicio7 { 
	public static void main (String args[]) { 
	System.out.println("¿De que numero quieres la tabla de multiplicar?");
	Scanner sc = new Scanner(System.in);
	int total=0;
	int a = sc.nextInt();
	for(int b=1; b<11; b++) { 
		total= a*b;
		System.out.println(a + " x " + b + " = " + total);
		}
	}
	}