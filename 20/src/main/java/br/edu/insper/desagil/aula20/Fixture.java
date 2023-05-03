package br.edu.insper.desagil.aula20;

import java.io.IOException;

import br.pro.hashi.sdx.dao.DaoClient;

public class Fixture {
	public static void main(String[] args) throws IOException {
		DaoClient client = DaoClient.fromCredentials("main.json");
		client.connect();

		/* NÃO MODIFIQUE NADA ACIMA DESTA LINHA. */

		//
		// Escreva seu código aqui.
		//

		/* NÃO MODIFIQUE NADA ABAIXO DESTA LINHA. */

		client.disconnect();
	}
}
