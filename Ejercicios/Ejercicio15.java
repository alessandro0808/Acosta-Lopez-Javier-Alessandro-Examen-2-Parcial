import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] paises = new String[4];   
        double[][] temperaturas = new double[4][3];
        double[] medias = new double[4];    

        for (int i = 0; i < 4; i++) {
            System.out.print("\nIngrese el nombre del país " + (i+1) + ": ");
            paises[i] = sc.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("   Temperatura del mes " + (j+1) + ": ");
                temperaturas[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n TEMPERATURAS INGRESADAS");
        for (int i = 0; i < 4; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(temperaturas[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            medias[i] = (temperaturas[i][0] + temperaturas[i][1] + temperaturas[i][2]) / 3;
        }

        System.out.println("\n TEMPERATURA MEDIA TRIMESTRAL");
        for (int i = 0; i < 4; i++) {
            System.out.println(paises[i] + ": " + medias[i]);
        }

        double mayor = medias[0];
        String paisMayor = paises[0];

        for (int i = 1; i < 4; i++) {
            if (medias[i] > mayor) {
                mayor = medias[i];
                paisMayor = paises[i];
            }
        }

        System.out.println("\nEl país con la temperatura media trimestral más alta es: " 
                            + paisMayor + " con " + mayor);

        sc.close();
    }
}
