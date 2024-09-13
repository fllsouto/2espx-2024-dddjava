package br.com.fiap.twoespx.libuncleotidio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(":: Lib Uncle Otidio ::");
        String entrada = "ACGTACGTAAAAAAAAAAAAAAAAAAAAA";

        int frequenciaA = 0;

        String[] entradaSplitada = entrada.split("");
        
        for(int i = 0; i <= entradaSplitada.length - 1; i++) {
            System.out.println("[i] = [" + i + "]");
            String caracter = entradaSplitada[i];
            System.out.println("caracter: " + caracter);

            if (caracter.equals("A")) {
                frequenciaA = frequenciaA + 1; 
            }
        }

        System.out.println("Sequência :: " + entrada);
        System.out.println("Tamanho da Sequência :: " + entrada.length());
        System.out.println("Total de A :: " + frequenciaA);
    }
}
