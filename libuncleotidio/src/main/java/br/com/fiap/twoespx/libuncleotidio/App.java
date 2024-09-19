package br.com.fiap.twoespx.libuncleotidio;

import java.util.List;

import br.com.fiap.twoespx.libuncleotidio.input.NucleotidioInputReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

            String filename = "entradas/entrada1.txt";

            NucleotidioInputReader nir = new NucleotidioInputReader();
            //List<String> lines = nir.readWithFileInputStream(filename);
            List<String> lines = nir.readWithScanner(filename);
            NucleotideoCounter nc = new NucleotideoCounter();

            // enhanced for: https://www.programiz.com/java-programming/enhanced-for-loop
            for (String line : lines) {
                nc.count(line);
            }
    }
}
