package com.monocept.model;

import java.util.*;

public class ComparatorPractice {
	
	public static void main(String args[]) {
		ArrayList<Song> songLst = new ArrayList<>();
		Song s1 = new Song("Lahore","Guru Randhawa",7);
		Song s2 = new Song("Talja","Jassa Dhillon",6);
		Song s3 = new Song("Raflan Te Botlan","Kaka",8);
		Song s4 = new Song("Chithiyaan","Karan Aujla",5);
		
		songLst.add(s1);
		songLst.add(s2);
		songLst.add(s3);
		songLst.add(s4);
		
		for(Song s: songLst)
			System.out.println(s.title);
		
		System.out.println();
		
		SongCompare cmp = new SongCompare();
		Collections.sort(songLst,cmp);
		
		for(Song s: songLst)
			System.out.println(s.title);
	}
	
}

class SongCompare implements Comparator<Song>{
	public int compare(Song one, Song two) {
		return one.title.compareTo(two.title);
	}
}
