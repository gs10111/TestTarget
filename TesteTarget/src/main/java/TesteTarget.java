import java.util.Scanner;


public class TesteTarget
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Verificar número na sequência de Fibonacci");
            System.out.println("2. Verificar existência de 'a' em uma string");
            System.out.println("3. Calcular valor final da variável SOMA");
            System.out.println("4. Completar sequência lógica");
            System.out.println("5. Resolver problema dos interruptores");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    Fibonacci.verificarFibonacci();
                    break;
                case 2:
                    VerificadorString.verificarString();
                    break;
                case 3:
                    CalculadoraSoma.calcularSoma();
                    break;
                case 4:
                    CompletarSequencia.completarSequencia();
                    break;
                case 5:
                    ProblemaInterruptores.resolverProblema();
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
