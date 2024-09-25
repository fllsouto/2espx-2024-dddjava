package br.com.fiap.twoespx.libuncleotidio;

import java.util.List;

import br.com.fiap.twoespx.libuncleotidio.input.NucleotidioInputReader;
import br.com.fiap.twoespx.libuncleotidio.output.NucletidioOutputWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

            String inputFilename = "entradas/entrada1.txt";
            String outputFilename = "saidas/saida2.txt";

            NucleotidioInputReader nir = new NucleotidioInputReader();
            NucletidioOutputWriter now = new NucletidioOutputWriter();
            //List<String> lines = nir.readWithFileInputStream(filename);
            List<String> lines = nir.readWithScanner(inputFilename);
            NucleotideoCounter nc = new NucleotideoCounter();

            // enhanced for: https://www.programiz.com/java-programming/enhanced-for-loop
            //for (String line : lines) {
            //    nc.count(line);
            //}

            String line = nir.readFromKeyboard();
            String output = nc.count(line);
            //now.writeFromFileOutputStream(outputFilename, output);
            now.writeWithPrintStream(outputFilename, output);
    }
}
