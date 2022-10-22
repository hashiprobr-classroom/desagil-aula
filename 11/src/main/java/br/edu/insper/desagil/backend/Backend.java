package br.edu.insper.desagil.backend;

import br.pro.hashi.nfp.dao.Firebase;
import br.pro.hashi.nfp.dao.FirebaseManager;

public class Backend {
	public static void main(String[] args) {
		FirebaseManager manager = Firebase.manager();

		Firebase firebase = manager.getFromCredentials("main.json");
		firebase.connect();

		/* NÃO MODIFIQUE NADA ACIMA DESTA LINHA. */

		//
		// Escreva seu código aqui.
		//

		/* NÃO MODIFIQUE NADA ABAIXO DESTA LINHA. */

		firebase.disconnect();
		firebase.delete();
	}
}
