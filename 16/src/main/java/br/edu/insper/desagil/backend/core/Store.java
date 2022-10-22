package br.edu.insper.desagil.backend.core;

import br.pro.hashi.nfp.dao.annotation.Autokey;

public class Store {
	@Autokey
	private String key;
	private String name;
	private double rating;
	private String category;
	private double distance;

	public Store() {
	}

	public Store(String name, double rating, String category, double distance) {
		this.name = name;
		this.rating = rating;
		this.category = category;
		this.distance = distance;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
}
