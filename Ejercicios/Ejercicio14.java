import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombres = new String[4];
        int[][] sueldos = new int[4][3];
        int[] totales = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("\nIngrese el nombre del empleado " + (i+1) + ": ");
            nombres[i] = sc.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("   Sueldo del mes " + (j+1) + ": ");
                sueldos[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            totales[i] = sueldos[i][0] + sueldos[i][1] + sueldos[i][2];
        }

        int totalGeneral = 0;
        for (int i = 0; i < 4; i++) {
            totalGeneral += totales[i];
        }

        int mayor = totales[0];
        String nombreMayor = nombres[0];

        for (int i = 1; i < 4; i++) {
            if (totales[i] > mayor) {
                mayor = totales[i];
                nombreMayor = nombres[i];
            }
        }
        System.out.println(" RESULTADOS ");
        System.out.println("Empleado con mayor ingreso: " + nombreMayor + " con " + mayor);
        System.out.println("Total pagado a todos los empleados: " + totalGeneral);
        
        sc.close();
    }
}
