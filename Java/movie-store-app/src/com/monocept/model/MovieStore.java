package com.monocept.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class MovieStore implements java.io.Serializable {
	
	private int id[] = new int[5];
	private String name[] = new String[5];
	private String genre[] = new String[5];
	private int year[] = new int[5];
	
	private int counter=0;
	
	public int getCounter() {
		return counter;
	}
	
	public void displayMovies() {
		if(counter==0)
		{
			System.out.println("No movies available");
			return;
		}
		
		for(int i=0; i<counter; i++) {
			System.out.println("id: "+id[i]);
			System.out.println("Name: "+name[i]);
			System.out.println("Genre: "+genre[i]);
			System.out.println("Year: "+year[i]);
			System.out.println();
		}
	}
	
	public void addMovie() throws IOException {
		if(counter>=5) {
			System.out.println("Movie store is full");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter movie name: ");
		this.name[this.counter] = sc.nextLine();
		System.out.print("Enter movie genre: ");
		this.genre[this.counter] = sc.nextLine();
		System.out.print("Enter movie year: ");
		this.year[this.counter] = sc.nextInt();
		this.id[this.counter] = ++this.counter;
		
		saveState(this);
	}
	
	public void saveState(MovieStore movie) throws IOException {
		FileOutputStream file = new FileOutputStream("data//state.bin");
        ObjectOutputStream out = new ObjectOutputStream(file);

        out.writeObject(this);
        out.close();
        file.close();
	}
	
	public MovieStore restoreState() throws IOException
	{
		MovieStore state = null;
		try
        {   
            FileInputStream file = new FileInputStream("data\\state.bin");
            ObjectInputStream in = new ObjectInputStream(file);
              
            state = (MovieStore)in.readObject();
              
            in.close();
            file.close();
//            System.out.println("\nState restored successfully\n");
        }
        catch(Exception ex)
        {
        	MovieStore movie = new MovieStore();
        	FileOutputStream file = new FileOutputStream("data//state.bin");
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(movie);
            out.close();
            file.close();
            
            state = movie;
//            System.out.println("Exception is caught");
        }
		return state;
		
	}
	
	public void clearAllMovies() throws IOException {
		counter = 0;
		System.out.println("Movie store cleard successfully\n");
		saveState(this);
	}
}
