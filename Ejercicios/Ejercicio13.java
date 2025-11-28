import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] alumnos = new int[3][4];
        int nivel, idioma;

        for (int i = 1; i <= 12; i++) {
            System.out.println("\nAlumno " + i);

            do {
                System.out.print("Ingresa el nivel (0=Básico, 1=Medio, 2=Perfeccionamiento): ");
                nivel = sc.nextInt();
            } while (nivel < 0 || nivel > 2);

            do {
                System.out.print("Ingresa el idioma (0=Inglés, 1=Francés, 2=Alemán, 3=Ruso): ");
                idioma = sc.nextInt();
            } while (idioma < 0 || idioma > 3);

            alumnos[nivel][idioma]++;
        }


        System.out.println("MATRIZ DE ESTUDIANTES");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(alumnos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
