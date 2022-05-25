package com.monocept.test;

import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.monocept.model.Actor;
import com.monocept.model.Movie;

public class ActorMovieTest {
	public static void main(String args[]) {
		add();
		System.out.println("End of main");
	}
	
	public static void add() {
		Movie mvi1 = new Movie(1001,"Welcome");
		Movie mvi2 = new Movie(1002,"Avengers");
		Movie mvi3 = new Movie(1003,"Fast an furious");
		Movie mvi4 = new Movie(1004,"Matrix");
		
		ArrayList<Movie> mvilst1 = new ArrayList<>();
		mvilst1.add(mvi1);
		mvilst1.add(mvi3);
		Actor actr1 = new Actor(101,"Akshay");
		actr1.setMovies(mvilst1);
		
		ArrayList<Movie> mvilst2 = new ArrayList<>();
		mvilst2.add(mvi2);
		mvilst2.add(mvi3);
		mvilst2.add(mvi4);
		Actor actr2 = new Actor(102,"Robert Downey Jr");
		actr2.setMovies(mvilst2);
		
		ArrayList<Movie> mvilst3 = new ArrayList<>();
		mvilst3.add(mvi1);
		mvilst3.add(mvi4);
		Actor actr3 = new Actor(103,"Crish");
		actr3.setMovies(mvilst3);
		
		ArrayList<Actor> actrlst1 = new ArrayList<>();
		actrlst1.add(actr1);
		actrlst1.add(actr3);
		mvi1.setActors(actrlst1);
		
		ArrayList<Actor> actrlst2 = new ArrayList<>();
		actrlst1.add(actr2);
		actrlst1.add(actr3);
		mvi2.setActors(actrlst2);
		
		ArrayList<Actor> actrlst3 = new ArrayList<>();
		actrlst3.add(actr3);
		actrlst3.add(actr1);
		mvi3.setActors(actrlst3);
		
		ArrayList<Actor> actrlst4 = new ArrayList<>();
		actrlst4.add(actr2);
		mvi4.setActors(actrlst4);
		
		
		
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();

	    Transaction txn = session.beginTransaction();
	    
	    try {
		      session.save(actr1);
		      session.save(actr2);
		      session.save(actr3);
		      session.save(mvi1);
		      session.save(mvi2);
		      session.save(mvi3);
		      session.save(mvi4);
		      txn.commit();
		    } catch (Exception e) {
		      System.out.println("error: "+e);
		      txn.rollback();
		    } finally {
		      if (session.isOpen())
		        session.close();
		    }
	}
	
	public static void displayAll() {
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    SessionFactory facotry = cfg.configure().buildSessionFactory();
	    Session session = facotry.openSession();
	}
}
