package br.edu.insper.desagil.backend.endpoint;

import br.edu.insper.desagil.backend.core.Store;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class StoreEndpoint extends Endpoint<Store> {
	public StoreEndpoint() {
		super("/stores");
	}
}
