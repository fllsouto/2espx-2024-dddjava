package br.com.fiap.twoespx.libuncleotidio;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String entrada = "AAAACCCTTG";

        NucleotideoCounter nc = new NucleotideoCounter();
        nc.count(entrada);
    }
}
