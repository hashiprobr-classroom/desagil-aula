package br.edu.insper.desagil.backend.dao;

import br.edu.insper.desagil.backend.core.Store;
import br.pro.hashi.nfp.dao.DAO;

public class StoreDAO extends DAO<Store> {
	public StoreDAO() {
		super("stores");
	}
}
