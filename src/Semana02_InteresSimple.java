import java.util.Scanner;

public class Semana02_InteresSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Ingrese la tasa de interés anual (en decimal, por ejemplo, 0.05 para 5%): ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese el tiempo en años: ");
        int tiempo = scanner.nextInt();

        double interes = principal * tasaInteres * tiempo;
        System.out.println("El interés simple es: " + interes);
    }
}
