import java.util.Scanner; 
	public class Ejercicio1 {
	public static void main (String args[]){ 
	Scanner sc = new Scanner (System.in); 
	String nombre[]= new String[10];
	int n=0;
	System.out.println("Dame 10 nombres: ");
		while (n<10) { 
			nombre[n] = sc.nextLine();
			n++;
			}
		n=0;
		System.out.println("Los nombres que me diste son: ");
		while (n<10) { 
			System.out.println(nombre[n]);
			n++;
			}
	}
}
