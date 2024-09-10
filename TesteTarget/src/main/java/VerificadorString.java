import java.util.Scanner;


public class VerificadorString {

    public static void verificarString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para verificar a ocorrência de 'a': ");
        String input = scanner.nextLine();

        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        System.out.println("A letra 'a' ocorre " + count + " vezes na string.");
    }
}
