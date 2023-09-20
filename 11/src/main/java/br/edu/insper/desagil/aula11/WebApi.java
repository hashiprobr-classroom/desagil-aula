package br.edu.insper.desagil.aula11;

import br.pro.hashi.sdx.rest.jackson.server.JacksonRestServer;
import br.pro.hashi.sdx.rest.server.RestServer;

public class WebApi {
	public static void main(String[] args) {
		RestServer server = JacksonRestServer.from("br.edu.insper.desagil.aula11.resource");

		server.start();
		System.out.println("Endereço: http://%s:8080".formatted(server.getPublicAddress()));
	}
}
