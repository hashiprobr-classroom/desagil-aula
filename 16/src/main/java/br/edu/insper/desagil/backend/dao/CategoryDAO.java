package br.edu.insper.desagil.backend.dao;

import br.edu.insper.desagil.backend.core.Category;
import br.pro.hashi.nfp.dao.DAO;

public class CategoryDAO extends DAO<Category> {
	public CategoryDAO() {
		super("categories");
	}
}
