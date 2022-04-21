package com.monocept.basics;

public class MagicNumber {

	public static void main(String args[]) {
		Player sachin = new Player(1,"Sachin");
		
		System.out.println(sachin.getName());
		System.out.println(sachin.getAge());
	}
}


class Player {

	private final static int defaultAge = 18;

	private int id;
	private String name;
	private int age;

	public Player(int id, String name) {
		this(id, name, defaultAge);
	}

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Player whoIsElder(Player player) {

		return this.getAge() > player.getAge() ? this : player;
	}
}