package com.monocept.model;

import java.io.IOException;

import com.monocept.service.MovieManager;

public class Movie implements java.io.Serializable {
	private int id;
	private String name;
	private String genre;
	private int year;
	private static int counter=0;
	
	public Movie(String name, String genre, int year) throws ClassNotFoundException, IOException {
		MovieManager service = new MovieManager();
		counter = service.getMovieCount();
		id = ++counter;
		this.name = name;
		this.genre = genre;
		this.year = year;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getYear() {
		return year;
	}
	
	public static int getCounter() {
		return counter;
	}
	
	@Override
	public String toString() {
		return ("Id:"+id+" Name:"+name+" Genre:"+genre+" Year:"+year);
	}
}
