import java.util.Scanner;
	public class Ejercicio9{
	public static void main(String args[]){
	double cal[]= new double[6];
	Scanner sc = new Scanner(System.in);
	double total=0;
	int b=1;
	System.out.println("Ingresa tu calificación final");
	for(int a=0; a<6; a++){
		System.out.println("Alumno "+b);
		cal[a]=sc.nextDouble();
		total= total+cal[a];
		b++;
		}
	double prom=total/6;
	System.out.println("Las calificaciones del grupo de 6 estudiantes son: ");
	for(int a=0; a<6; a++){
		System.out.println(cal[a]);
		}
		System.out.println("El promedio general del grupo es de " +prom);

	
}
}
		
		