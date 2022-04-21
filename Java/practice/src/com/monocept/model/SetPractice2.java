package com.monocept.model;

import java.util.ArrayList;
import java.util.HashSet;

public class SetPractice2 {
	public static void main(String args[]) {
		ArrayList<Song2> songLst = new ArrayList<>();
		Song2 s1 = new Song2("Lahore","Guru Randhawa",7);
		Song2 s2 = new Song2("Talja","Jassa Dhillon",6);
		Song2 s3 = new Song2("Raflan Te Botlan","Kaka",8);
		Song2 s4 = new Song2("Chithiyaan","Karan Aujla",5);
		Song2 s5 = new Song2("Raflan Te Botlan","TKoka",90);
		Song2 s6 = s1;
		
		songLst.add(s1);
		songLst.add(s2);
		songLst.add(s3);
		songLst.add(s4);
		songLst.add(s5);
		songLst.add(s6);
		
		HashSet<Song2> songSet = new HashSet<>();
		songSet.addAll(songLst);
		
		for(Song2 s: songSet)
			System.out.println(s.title);
		
		
	}
}
