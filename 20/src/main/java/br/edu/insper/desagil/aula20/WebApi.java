package br.edu.insper.desagil.aula20;

import br.pro.hashi.sdx.dao.DaoClient;
import br.pro.hashi.sdx.rest.jackson.server.JacksonRestServer;
import br.pro.hashi.sdx.rest.server.RestServer;

public class WebApi {
	public static void main(String[] args) {
		DaoClient client = DaoClient.fromCredentials("main.json");
		client.connect();

		RestServer server = JacksonRestServer.from("br.edu.insper.desagil.aula20.resource");
		server.start();
		System.out.println("Endereço privado: %s".formatted(server.getPrivateUrl()));
		System.out.println("Endereço público: %s".formatted(server.getPublicUrl()));
	}
}
