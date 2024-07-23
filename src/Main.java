import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de suma");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = sumar(num1, num2);

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static double sumar(double a, double b) {
        return a + b;
    }
}


