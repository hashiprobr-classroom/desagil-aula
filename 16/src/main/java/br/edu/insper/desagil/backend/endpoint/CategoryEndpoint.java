package br.edu.insper.desagil.backend.endpoint;

import java.util.List;

import br.edu.insper.desagil.backend.core.Category;
import br.edu.insper.desagil.backend.dao.CategoryDAO;
import br.pro.hashi.nfp.dao.Selection;
import br.pro.hashi.nfp.rest.server.Endpoint;

public class CategoryEndpoint extends Endpoint<Category> {
	private CategoryDAO dao;

	public CategoryEndpoint() {
		super("/categories");
		dao = new CategoryDAO();
	}

	@Override
	public List<Category> get() {
		Selection selection = dao.selectAll();
		return dao.retrieve(selection);
	}
}
