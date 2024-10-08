package br.com.fiap.twoespx.libuncleotidio.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NucleotidioInputReader {

    public List<String> readWithFileInputStream(String filename) {
        List<String> lines =  new ArrayList<String>();

        try {
            InputStream fis = new FileInputStream(filename);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine();

            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
            reader.close();
            return lines;

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            System.out.println("Arquivo não encontrado: " + fnfe);
            return lines;
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            System.out.println("Linha mal formatada: " + ioe);
            return lines;
        }
    }


    public List<String> readWithScanner(String filename) {
        List<String> lines =  new ArrayList<String>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                lines.add(line);
            }
            scanner.close();
            return lines;
        } catch (FileNotFoundException fnfe) {
            // TODO Auto-generated catch block
            fnfe.printStackTrace();
            System.out.println("Arquivo não encontrado: " + fnfe);
            return lines;
        }
    }

    // Leitura com o teclado
    public String readFromKeyboard() {
        InputStream systemIn = System.in;
        Scanner scanner = new Scanner(systemIn);
        System.out.println("Please inser a valid Nucletidio Sequence: ");
        String line = scanner.nextLine();
        scanner.close();
        return line;
    }
    
}
