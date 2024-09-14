import java.util.Scanner;

public class LerDna {
    private static Scanner scanner = new Scanner(System.in);
    private static String dna;

    public static void lerDna(String dna) {
        if (dna.length() > 16) {
            System.out.println("ULTRAPASSOU O LIMITE");
            return;
        }

        int A = 0;
        int C = 0;
        int G = 0;
        int T = 0;

        for (int i = 0; i < dna.length(); i++) {
            char caractere = dna.charAt(i);

            if (caractere != 'A' && caractere != 'C' && caractere != 'G' && caractere != 'T') {
                System.out.println("Caractere inválido: " + caractere);
                continue;
            }

            switch (caractere) {
                case 'A':
                    A += 1;
                    break;
                case 'C':
                    C += 1;
                    break;
                case 'G':
                    G += 1;
                    break;
                case 'T':
                    T += 1;
                    break;
            }
        }

        System.out.println("Quantidade de A: " + A);
        System.out.println("Quantidade de C: " + C);
        System.out.println("Quantidade de G: " + G);
        System.out.println("Quantidade de T: " + T);
    }

    public static void main(String[] args) {
        System.out.println("me informe seu DNA");
        dna = scanner.next();

        lerDna(dna);
    }
}
