package br.edu.insper.desagil.aula12;

import br.pro.hashi.sdx.dao.DaoClient;

public class Update {
	public static void main(String[] args) {
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
