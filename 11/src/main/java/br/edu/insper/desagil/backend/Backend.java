package br.edu.insper.desagil.backend;

import br.pro.hashi.nfp.dao.Firebase;
import br.pro.hashi.nfp.dao.FirebaseManager;

public class Backend {
	public static void main(String[] args) {
		FirebaseManager manager = Firebase.manager();

		Firebase firebase = manager.getFromCredentials("main.json");
		firebase.connect();

		/* Não altere nada acima desta linha. */

		//
		// Escreva seu código aqui.
		//

		/* Não altere nada abaixo desta linha. */

		firebase.disconnect();
		firebase.delete();
	}
}
