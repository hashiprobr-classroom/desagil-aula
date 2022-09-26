package br.edu.insper.desagil.backend;

import br.pro.hashi.nfp.rest.server.RESTServer;
import br.pro.hashi.nfp.rest.server.RESTServerFactory;

public class Backend {
	public static void run(int port, boolean useTunnel) {
		RESTServerFactory factory = RESTServer.factory();

		String endpointPrefix = "br.edu.insper.desagil.backend.endpoint";
		String converterPrefix = "br.edu.insper.desagil.backend.converter";

		RESTServer server = factory.build(endpointPrefix, converterPrefix, port);

		server.start(useTunnel);

		System.out.println(server.getUrl());

		Runtime.getRuntime().addShutdownHook(new Thread(() -> {
			server.stop();
		}));
	}

	public static void main(String[] args) {
		run(8080, false);
	}
}
