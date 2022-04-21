package com.monocept.model.test;

import java.io.IOException;
import java.util.Scanner;

import com.monocept.model.MovieStore;
import com.monocept.model.MovieStore;

public class MovieStoreTest {
	public static void main(String args[]) throws IOException {
		
		MovieStore store = new MovieStore();
		
		store.restoreState();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to movie store devloped by Shikhar");
		
		while(true) {
			System.out.println("Welcome to movie store devloped by Shikhar");
			System.out.println("Movie count: "+store.getCounter());
			System.out.println("1. Add movie\n2. Display movies\n3. Clear all movies\n4. Exit");
			
			int choice;
			choice  = sc.nextInt();
			
			if(choice==1)
				store.addMovie();
			if(choice==2)
				store.displayMovies();
			if(choice==3)
				store.clearAllMovies();
			if(choice==4)
				break;
		}
		
	}
	
}
