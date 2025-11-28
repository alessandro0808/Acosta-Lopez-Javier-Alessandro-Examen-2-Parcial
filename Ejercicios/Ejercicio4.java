import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        double sal = 5000;
        double ret = 0;
	int n=1;
        while (n == 1) {
            System.out.println("CAJERO AUTOMATICO");
            System.out.println("\n SALDO DISPONIBLE: "+sal);
	    System.out.println("Ingrese el monto a retirar: ");
            ret = sc.nextDouble();
               
                if (ret > sal) {
                        System.out.println("\nERROR: El retiro no puede ser mayor al saldo");
                        System.out.println("Tu saldo actual es: " + sal);
                    }

                else {

                sal = sal - ret;

                System.out.println("Haz retirado correctamente tu dinero: ");
		}
		System.out.println("¿Desea realizar otra operación? (S/N)");
           	 char op1 = sc.next().toUpperCase().charAt(0);

                if (op1 != 'S') {
                    System.out.println("Haz salido del cajero");
                    n = 2;
                }

            }
    }
}

	