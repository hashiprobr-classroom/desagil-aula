package br.edu.insper.desagil.backend.endpoint;

import br.edu.insper.desagil.backend.core.Profile;
import br.edu.insper.desagil.backend.dao.ProfileDAO;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class ProfileEndpoint extends Endpoint<Profile> {
	private ProfileDAO dao;

	public ProfileEndpoint() {
		super("/profiles");
		dao = new ProfileDAO();
	}

	@Override
	public Object put(Profile profile) {
		dao.update(profile);
		return null;
	}
}
