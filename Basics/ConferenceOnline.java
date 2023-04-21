package com.rtit.esilv.bin1.esilv.basics;

public class ConferenceOnline {
	//Attributs
	private int password;
	private Conference conference;

	//Constructeurs
	public ConferenceOnline(int password, Conference conference) {
		this.password = password;
		this.conference = conference;
	}
  
	@Override
	public String toString() {
		String url = "\nURL de connexion : " + "https://" + conference.getNom().toLowerCase() + conference.getAnnee() + "-online.zoom.us/" + getPassword();
		url = url.replace(";", "").replace("#", "").replace("\\s", "").replace("\\n", "").replace("\\", "");
		return url;
	}
	//Getters et Setters
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
}
