import java.util.Arrays;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Digite os nomes com virgula e sem dar espaçamento");
        nome = scanner.next();

        String[] nomeFinal = nome.split(",");

        Arrays.sort(nomeFinal);
        for (String nomes : nomeFinal) {
            System.out.print(nomes + ", ");
        }

    }
}