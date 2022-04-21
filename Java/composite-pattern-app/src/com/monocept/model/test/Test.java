package com.monocept.model.test;

import com.monocept.model.*;

public class Test {
	public static void main(String args[]) {
		
		Folder root = new Folder("Movies");
		
		Folder hindi = new Folder("Hindi");
		File dhoom = new File("Dhoom", "1.4 Gb");
		File dangal = new File("Dangal", "1.8 Gb");
		hindi.addChild(dhoom);
		hindi.addChild(dangal);
		
		Folder action = new Folder("Action");
		action.addChild(new File("Race","1.2 Gb"));
		hindi.addChild(action);
		
		
		Folder english = new Folder("English");
		File avengers = new File("Avengers", "2.4 Gb");
		english.addChild(avengers);
		
		Folder comady = new Folder("Comady");
		File johnnyEnglish = new File("Johnny English", "800 Mb");
		comady.addChild(johnnyEnglish);
		
		english.addChild(comady);
		
		
		root.addChild(hindi);
		root.addChild(english);
		
		root.showHierarchy(0);
	}
}
