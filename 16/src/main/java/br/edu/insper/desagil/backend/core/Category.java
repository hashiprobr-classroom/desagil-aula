package br.edu.insper.desagil.backend.core;

import br.pro.hashi.nfp.dao.annotation.Key;

public class Category {
	@Key
	private String name;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
