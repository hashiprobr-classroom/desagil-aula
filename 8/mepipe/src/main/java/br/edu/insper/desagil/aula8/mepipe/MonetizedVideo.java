package br.edu.insper.desagil.aula8.mepipe;

import java.util.Map;

public class MonetizedVideo extends Video {
	private Map<Integer, String> ads;

	public MonetizedVideo(String id, String title, Map<Integer, String> ads) {
		super(id, title);
		this.ads = ads;
	}

	@Override
	public int numberOfAds() {
		return ads.size();
	}
}
