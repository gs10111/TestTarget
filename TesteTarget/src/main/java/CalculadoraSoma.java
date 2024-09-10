
public class CalculadoraSoma {

    public static void calcularSoma() {
        int INDICE = 12, SOMA = 0, K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor final da variável SOMA é: " + SOMA);
    }
}
