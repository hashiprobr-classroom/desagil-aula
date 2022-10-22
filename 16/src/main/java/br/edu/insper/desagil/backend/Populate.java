package br.edu.insper.desagil.backend;

import java.io.IOException;

import br.edu.insper.desagil.backend.core.Category;
import br.edu.insper.desagil.backend.core.Profile;
import br.edu.insper.desagil.backend.core.Store;
import br.edu.insper.desagil.backend.dao.CategoryDAO;
import br.edu.insper.desagil.backend.dao.ProfileDAO;
import br.edu.insper.desagil.backend.dao.StoreDAO;
import br.pro.hashi.nfp.dao.Firebase;

public class Populate {
	public static void main(String[] args) throws IOException {
		Factory factory = new Factory("main");
		Firebase firebase = factory.buildFirebase();
		firebase.connect();

		/* NÃO MODIFIQUE NADA ACIMA DESTA LINHA. */

		ProfileDAO profileDAO = new ProfileDAO();
		profileDAO.create(new Profile(1, "Zé Pudim"));

		CategoryDAO categoryDAO = new CategoryDAO();
		categoryDAO.create(new Category("Italian"));
		categoryDAO.create(new Category("Japanese"));

		StoreDAO storeDAO = new StoreDAO();
		storeDAO.create(new Store("Store 1", 4.5, "Italian", 2.2));
		storeDAO.create(new Store("Store 2", 3.2, "Japanese", 0.5));
		storeDAO.create(new Store("Store 3", 4.9, "Desserts", 9.7));
		storeDAO.create(new Store("Store 4", 1.5, "Norwegian", 1.2));

		/* NÃO MODIFIQUE NADA ABAIXO DESTA LINHA. */

		firebase.delete();
	}
}
