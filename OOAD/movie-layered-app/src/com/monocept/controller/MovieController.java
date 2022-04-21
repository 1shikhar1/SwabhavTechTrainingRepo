package com.monocept.controller;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.Movie;
import com.monocept.service.MovieManager;

public class MovieController {
	
	public void start() throws IOException, ClassNotFoundException {
		
		System.out.println("Welcome to movie store app developed by Shikhar.");
		displayMenu();
	}
	
	public void displayMenu() throws IOException, ClassNotFoundException {
		
		
		while(true) {
			MovieManager service = new MovieManager();
			System.out.println("Movies count: "+service.getMovieCount());
			System.out.println("1. Add movie");
			System.out.println("2. Display movies");
			System.out.println("3. Delete movies");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice: ");
			
			Scanner sc = new Scanner(System.in);
			String choic = sc.nextLine();
			int choice = Integer.parseInt(choic);
			
			if(choice == 1) {
				String name;
				String genre;
				int year;
				
				System.out.print("Enter movie name: ");
				name = sc.nextLine();
				System.out.print("Enter movie genre: ");
				genre = sc.nextLine();
				System.out.print("Enter movie year: ");
				year = sc.nextInt();
				
				Movie movie = new Movie(name, genre, year);
				service.addMovie(movie);
				
			}
			
			if(choice == 2) {
				for(Movie movie : service.getMovies()) {
					System.out.println(movie);
				}
			}
			
			if(choice == 3) {
				service.clearAllMovies();
			}
			
			if(choice == 4) {
				break;
			}
		}
	}
	
}
