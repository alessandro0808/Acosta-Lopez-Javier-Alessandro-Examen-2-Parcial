import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        System.out.println("Ingrese los datos de los artículos:");

        for (int i = 0; i < 3; i++) {

            System.out.print("\nNombre del artículo " + (i+1) + ": ");
            articulos[i][0] = sc.next();

            System.out.print("Talla: ");
            articulos[i][1] = sc.next();

            System.out.print("Color: ");
            articulos[i][2] = sc.next();
        }

        System.out.println("\n------------------------------------------");
        System.out.println("   Artículo        Talla        Color");
        System.out.println("------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("   %-15s %-12s %-10s\n",
                articulos[i][0], articulos[i][1], articulos[i][2]);
        }

        System.out.println("------------------------------------------");

        sc.close();
    }
}
