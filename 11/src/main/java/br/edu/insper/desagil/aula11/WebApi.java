package br.edu.insper.desagil.aula11;

import br.pro.hashi.sdx.rest.jackson.server.JacksonRestServer;
import br.pro.hashi.sdx.rest.server.RestServer;

public class WebApi {
    void main() {
        RestServer server = JacksonRestServer.from("br.edu.insper.desagil.aula11.resource");

        server.start();
        IO.println("Endereço: http://" + server.getPublicAddress() + ":8080");
    }
}
