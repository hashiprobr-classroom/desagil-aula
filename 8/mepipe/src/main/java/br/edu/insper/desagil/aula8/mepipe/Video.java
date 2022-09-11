package br.edu.insper.desagil.aula8.mepipe;

import java.util.ArrayList;
import java.util.List;

public class Video {
	private String id;
	private String title;
	private List<String> likes;
	private List<String> dislikes;

	public Video(String id, String title) {
		this.id = id;
		this.title = title;
		this.likes = new ArrayList<>();
		this.dislikes = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public List<String> getLikes() {
		return likes;
	}

	public List<String> getDislikes() {
		return dislikes;
	}

	public int numberOfAds() {
		throw new RuntimeException("This method does not exist.");
	}
}
