package br.edu.insper.desagil.aula10;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileManager {
    private CharsetDecoder decoder;

    public FileManager() {
        this.decoder = Charset.forName("UTF-8").newDecoder();
    }

    public String load(String path) {
        IO.println("Abrindo leitor");
        InputStream fileStream = new FileInputStream(path);
        IO.println("Leitor aberto");

        Reader fileReader = new InputStreamReader(fileStream, decoder);
        BufferedReader reader = new BufferedReader(fileReader);

        IO.println("Lendo conteúdo");
        String content = "";
        String line = reader.readLine();
        while (line != null) {
            content += line;
            line = reader.readLine();
        }
        content += "\n";
        IO.println("Conteúdo lido");

        IO.println("Fechando leitor");
        reader.close();
        IO.println("Leitor fechado");

        return content;
    }

    public void save(String path, String content) {
        IO.println("Abrindo escritor");
        FileWriter writer = new FileWriter(path);
        IO.println("Escritor aberto");

        IO.println("Escrevendo conteúdo");
        writer.write(content);
        IO.println("Conteúdo escrito");

        IO.println("Fechando escritor");
        writer.close();
        IO.println("Escritor fechado");
    }
}
