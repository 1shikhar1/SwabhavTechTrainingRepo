package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Movie {
	@Id
	private int Mid;
	private String movieName;
	@ManyToMany(mappedBy = "movies",cascade = CascadeType.ALL)
	private List<Actor> actors = new ArrayList<>();

	public Movie() {
		super();

	}

	public Movie(int mid, String movieName) {
		super();
		Mid = mid;
		this.movieName = movieName;
	}

	public int getMid() {
		return Mid;
	}


	public String getMovieName() {
		return movieName;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}
}
