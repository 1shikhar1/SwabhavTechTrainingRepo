package com.monocept.service;

import java.io.*;
import java.util.*;

import com.monocept.model.Movie;

public class MovieManager implements java.io.Serializable{

	private List<Movie> movies = new ArrayList<>();
	
	public MovieManager() throws IOException, ClassNotFoundException {
		loadMovies();
	}
	
	public int getMovieCount() {
		return movies.size();
	}
	
	public void clearAllMovies() throws IOException {
		movies.clear();
		saveMovies();
	}
	
	public List<Movie> getMovies() throws IOException {
		return movies;
	}
	
	public void addMovie(Movie movie) throws IOException, ClassNotFoundException {
		
		loadMovies();	
		movies.add(movie);
		saveMovies();
	}
	
	private void loadMovies() throws IOException, ClassNotFoundException
	{  
			
			try {
				FileInputStream file = new FileInputStream("state.bin");
				
				ObjectInputStream in = new ObjectInputStream(file);
	              
	            movies = (List<Movie>) in.readObject();
	              
	            in.close();
	            file.close();
	            
			} catch (FileNotFoundException e) {
				saveMovies();
			}	
	}
	
	private void saveMovies() throws IOException {
		FileOutputStream file = new FileOutputStream("state.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(movies);
        out.close();
        file.close();
	}
}
