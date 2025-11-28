import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] atletas = new String[5][4];

        System.out.println("Ingrese la información de 5 atletas:");

        for (int i = 0; i < 5; i++) {

            System.out.println("\nAtleta " + (i + 1));

            System.out.print("Nombre: ");
            atletas[i][0] = sc.next();

            System.out.print("Apellido: ");
            atletas[i][1] = sc.next();

            System.out.print("Especialidad (100m, 200m, 400m, etc.): ");
            atletas[i][2] = sc.next();

            System.out.print("Tiempo registrado (segundos): ");
            atletas[i][3] = sc.next();
        }

        double mejorTiempo = Double.parseDouble(atletas[0][3]);
        int indiceMejor = 0;

        for (int i = 1; i < 5; i++) {
            double tiempoActual = Double.parseDouble(atletas[i][3]);
            if (tiempoActual < mejorTiempo) {
                mejorTiempo = tiempoActual;
                indiceMejor = i;
            }
        }

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Nombre       Apellido     Especialidad      Tiempo (s)");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-12s %-12s %-15s %-10s",
                    atletas[i][0], atletas[i][1], atletas[i][2], atletas[i][3]);

            if (i == indiceMejor) {
                System.out.print("  <-- Mejor tiempo");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------------");

        sc.close();
    }
}
