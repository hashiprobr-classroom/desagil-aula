package br.edu.insper.desagil.backend.core;

import br.pro.hashi.nfp.dao.annotation.Key;

public class Profile {
	@Key
	private int id;
	private String name;

	public Profile() {
	}

	public Profile(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
