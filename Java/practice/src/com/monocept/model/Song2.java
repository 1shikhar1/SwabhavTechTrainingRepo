package com.monocept.model;

public class Song2 implements Comparable<Song2>{
	String title;
	String artist;
	int rating;
	
	public Song2(String t, String a, int r) {
		title = t;
		artist = a;
		rating = r;
	}
	
	public boolean equals(Object obj) {
		Song2 s = (Song2) obj;
		return title.equals(s.title) && artist.equals(s.artist);
	}
	
	public int hashCode() {
		return title.hashCode();
	}

	public int compareTo(Song2 s) {
		return title.compareTo(s.title);
	}
}
