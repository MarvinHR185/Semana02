import java.util.Scanner;

public class Semana02_CuotaPrestamo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto del préstamo: ");
        double montoPrestamo = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en decimal, por "
                + "ejemplo, 0.06 para 6%): ");
        double tasaInteresAnual = scanner.nextDouble();

        System.out.print("Ingrese el número total de pagos (meses): ");
        int numeroPagos = scanner.nextInt();

        double tasaInteresMensual = tasaInteresAnual / 12;
        double cuotaMensual = montoPrestamo * (tasaInteresMensual * Math.pow(1 
                + tasaInteresMensual, numeroPagos)) / (Math.pow(1 + 
                        tasaInteresMensual, numeroPagos) - 1);
        System.out.println("La cuota mensual del préstamo es: " + cuotaMensual);
    }
}
