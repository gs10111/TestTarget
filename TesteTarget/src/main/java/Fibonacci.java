import java.util.Scanner;

public class Fibonacci {
    public static void verificarFibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (b == numero || numero == 0) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
