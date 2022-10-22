package br.edu.insper.desagil.backend.dao;

import br.edu.insper.desagil.backend.core.Profile;
import br.pro.hashi.nfp.dao.DAO;

public class ProfileDAO extends DAO<Profile> {
	public ProfileDAO() {
		super("profiles");
	}
}
