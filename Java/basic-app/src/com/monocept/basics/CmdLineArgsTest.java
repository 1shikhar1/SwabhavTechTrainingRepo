package com.monocept.basics;

public class CmdLineArgsTest {
	public static void main(String userNames[]) {
		
		if(userNames.length==0)
		System.out.println("No argument is passed");
		for(String userName: userNames)
		System.out.println(userName);
	}
}
