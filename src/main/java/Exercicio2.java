import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Insira uma palavra: ");
        String palavra = leitura.nextLine();

        long count = palavra.chars()
                .filter(c -> c == 'a' || c == 'A')
                .count();

        System.out.printf("A letra aparece " + count + " vezes na string.");

    }

}
