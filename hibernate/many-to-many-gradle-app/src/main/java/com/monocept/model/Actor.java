package com.monocept.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Actor {
	@Id
	private int aid;
	private String actorName;
	
	@ManyToMany
	@JoinTable
	private List<Movie> movies = new ArrayList<>();
	
	public Actor() {
		super();

	}

	public Actor(int aid, String actorName) {
		super();
		this.aid = aid;
		this.actorName = actorName;
	}

	public int getAid() {
		return aid;
	}


	public String getActorName() {
		return actorName;
	}


	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

}
