import java.util.Scanner;
public class Ejercicio6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	double cal=0;
	double total=0;
	double prom2=0;
	int ap=0;
	int rep=0;
	int c=1;
	double prom=0;
	double prom1=0;
	System.out.println("Ingresa tus 4 calificaciones");
	for(int a=0;a<5;a++) {
	System.out.println("Alumno: " +c);
		for(int b=0; b<4;b++){
			cal= sc.nextDouble();
			total=total+cal;
			}
		prom=total/4;
		prom1=prom1+prom;
		if(prom>=6)
			ap=ap+1;
		else
			rep=rep+1;
	
		c++;
		total=0;
	}
	prom1=prom1/5;
	System.out.print("El total de aprobados es de " +ap+ " de reprobados es de " +rep+ " y el promedio general del grupo es de " + prom1);
	}
}
	
	