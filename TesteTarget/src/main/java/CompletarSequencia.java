
public class CompletarSequencia {


    public static void completarSequencia() {
        System.out.println("a) Próximo número é: " + proximoNumeroA());
        System.out.println("b) Próximo número é: " + proximoNumeroB());
        System.out.println("c) Próximo número é: " + proximoNumeroC());
        System.out.println("d) Próximo número é: " + proximoNumeroD());
        System.out.println("e) Próximo número é: " + proximoNumeroE());
        System.out.println("f) Próximo número é: " + proximoNumeroF());
    }

    /**
     * Encontra o próximo número na sequência a) 1, 3, 5, 7, ___
     *
     * @return O próximo número da sequência.
     */
    public static int proximoNumeroA() {
        // Sequência de números ímpares consecutivos
        int[] sequencia = {1, 3, 5, 7};
        return sequencia[sequencia.length - 1] + 2; // Incrementa de 2
    }

    /**
     * Encontra o próximo número na sequência b) 2, 4, 8, 16, 32, 64, ____
     *
     * @return O próximo número da sequência.
     */
    public static int proximoNumeroB() {
        // Sequência de potências de 2
        int[] sequencia = {2, 4, 8, 16, 32, 64};
        return sequencia[sequencia.length - 1] * 2; // Multiplica por 2
    }

    /**
     * Encontra o próximo número na sequência c) 0, 1, 4, 9, 16, 25, 36, ____
     *
     * @return O próximo número da sequência.
     */
    public static int proximoNumeroC() {
        // Sequência de quadrados perfeitos: 0^2, 1^2, 2^2, 3^2, ...
        int[] sequencia = {0, 1, 4, 9, 16, 25, 36};
        int n = sequencia.length; // Próximo número é n^2
        return n * n;
    }

    /**
     * Encontra o próximo número na sequência d) 4, 16, 36, 64, ____
     *
     * @return O próximo número da sequência.
     */
    public static int proximoNumeroD() {
        // Sequência de quadrados de números pares: 2^2, 4^2, 6^2, ...
        int[] sequencia = {4, 16, 36, 64};
        int n = sequencia.length * 2; // Próximo número é (n+2)^2
        return n * n;
    }

    /**
     * Encontra o próximo número na sequência e) 1, 1, 2, 3, 5, 8, ____
     *
     * @return O próximo número da sequência.
     */
    public static int proximoNumeroE() {
        // Sequência de Fibonacci
        int[] sequencia = {1, 1, 2, 3, 5, 8};
        int ultimo = sequencia[sequencia.length - 1];
        int penultimo = sequencia[sequencia.length - 2];
        return ultimo + penultimo; // Soma dos dois números anteriores
    }

    /**
     * Encontra o próximo número na sequência f) 2, 10, 12, 16, 17, 18, 19, ____
     *
     * @return O próximo número da sequência.
     */
    public static int proximoNumeroF() {
        // Sequência alternando entre adicionar 8 e adicionar 1
        int[] sequencia = {2, 10, 12, 16, 17, 18, 19};
        if (sequencia.length % 2 == 0) {
            return sequencia[sequencia.length - 1] + 1; // Adiciona 1
        } else {
            return sequencia[sequencia.length - 1] + 8; // Adiciona 8
        }
    }
}
