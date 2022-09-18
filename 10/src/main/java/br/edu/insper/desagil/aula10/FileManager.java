package br.edu.insper.desagil.aula10;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileManager {
	private CharsetDecoder decoder;

	public FileManager() {
		this.decoder = Charset.forName("UTF-8").newDecoder();
	}

	public String load(String path) {
		System.out.println("Abrindo leitor");
		InputStream fileStream = new FileInputStream(path);
		System.out.println("Leitor aberto");

		Reader fileReader = new InputStreamReader(fileStream, decoder);
		BufferedReader reader = new BufferedReader(fileReader);

		System.out.println("Lendo conteúdo");
		String content = "";
		String line = reader.readLine();
		while (line != null) {
			content += line;
			line = reader.readLine();
		}
		content += "\n";
		System.out.println("Conteúdo lido");

		System.out.println("Fechando leitor");
		reader.close();
		System.out.println("Leitor fechado");

		return content;
	}

	public void save(String path, String content) {
		System.out.println("Abrindo escritor");
		FileWriter writer = new FileWriter(path);
		System.out.println("Escritor aberto");

		System.out.println("Escrevendo conteúdo");
		writer.write(content);
		System.out.println("Conteúdo escrito");

		System.out.println("Fechando escritor");
		writer.close();
		System.out.println("Escritor fechado");
	}
}
