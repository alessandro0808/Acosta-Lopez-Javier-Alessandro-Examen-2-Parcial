import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int op = 0;
        int n = 1;
        double pago = 0;
        double total = 1000;
        double adeudo = 1000;

        while (n == 1) {
            System.out.println("CAJERO AUTOMATICO");
            System.out.println("\n Elige una opción:");
            System.out.println("1. Consulta");
            System.out.println("2. Pago del mes");
            System.out.println("3. Pago del adeudo");
            System.out.println("4. Salir");

            op = sc.nextInt();
            if (op == 1) {
                System.out.println("CONSULTA");
                System.out.println("Cuentas con un adeudo de: " + adeudo);

                System.out.println("¿Desea realizar otra operación? (S/N)");
                char op1 = sc.next().toUpperCase().charAt(0);

                if (op1 != 'S') {
                    System.out.println("Haz salido del cajero");
                    n = 2;
                }
            }

            else if (op == 2) {

                System.out.println("PAGO DEL MES\nDebes pagar: " + total);

                do {
                    System.out.print("Ingresa el monto a pagar: ");
                    pago = sc.nextDouble();

                    if (pago > total) {
                        System.out.println("\nERROR: El pago no puede ser mayor al total que debes pagar");
                        System.out.println("Tu adeudo actual es: " + total);
                    }

                } while (pago > total);

                total -= pago;

                System.out.println("Pago realizado correctamente. Saldo restante del mes: " + total);

                System.out.println("¿Desea realizar otra operación? (S/N)");
                char op1 = sc.next().toUpperCase().charAt(0);

                if (op1 != 'S') {
                    System.out.println("Haz salido del cajero");
                    n = 2;
                }
            }

            else if (op == 3) {

                System.out.println("PAGO DEL ADEUDO\nDebes pagar: " + adeudo);

                do {
                    System.out.print("Ingresa el monto a pagar: ");
                    pago = sc.nextDouble();

                    if (pago > adeudo) {
                        System.out.println("\nERROR: El pago no puede ser mayor al adeudo.");
                        System.out.println("Tu adeudo actual es: " + adeudo);
                    }

                } while (pago > adeudo);

                adeudo -= pago;

                System.out.println("Pago realizado correctamente. Saldo restante del adeudo: " + adeudo);

                System.out.println("¿Desea realizar otra operación? (S/N)");
                char op1 = sc.next().toUpperCase().charAt(0);

                if (op1 != 'S') {
                    System.out.println("Haz salido del cajero");
                    n = 2;
                }
            }

            else if (op == 4) {
                System.out.println("Haz salido del cajero");
                n = 2;
            }

            else {
                System.out.println("Opción no válida.");
            }
        }
    }
}

	