import java.util.Scanner;

public class Semana02_InteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en decimal, por ejemplo, 0.05 para 5%): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el número de veces que se aplica el interés por año: ");
        int numeroCompuestos = scanner.nextInt();

        System.out.print("Ingrese el tiempo en años: ");
        int tiempo = scanner.nextInt();

        double montoTotal = principal * Math.pow((1 + tasaInteres / numeroCompuestos), numeroCompuestos * tiempo);
        System.out.println("El monto total después del interés compuesto es: " + montoTotal);
    }
}
