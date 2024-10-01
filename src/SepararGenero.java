import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SepararGenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        System.out.println("Digite o nome e o sexo de uma pessoa");
        System.out.println("se for Masculino M, e se for Feminino F");
        System.out.println("Digite o nome e o sexo com o - e logo após a ,");

        nome = scanner.next();

        String[] nomeFinal = nome.split(",");

        List<String> Masculino = new ArrayList<String>();
        List<String> Feminino = new ArrayList<String>();

        Arrays.sort(nomeFinal);

        for (String nomes : nomeFinal) {
            if (nomes.contains("-M")) {
                Masculino.add(nomes);
            } else if (nomes.contains("-F")) {
                Feminino.add(nomes);
            }
        }

        System.out.println("Pessoas do sexo Masculino:" + Masculino);
        System.out.println("Pessoas do sexo Feminino:" + Feminino);

    }
}