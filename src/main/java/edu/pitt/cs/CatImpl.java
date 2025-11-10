package edu.pitt.cs;

public class CatImpl implements Cat {
	Cat c1;
	String name1 = "";
	int id1 = 1;
	boolean rented1 = false;
	public CatImpl(int id, String name) {
		this.id1 = id;
		this.name1 = name;
	}

	public void rentCat() {
		rented1 = true;
	}

	public void returnCat() {
		rented1 = false;
	}

	public void renameCat(String name) {
		name1 = name;
	}

	public String getName() {
		return name1;
	}

	public int getId() {
		return id1;
	}

	public boolean getRented() {
		return rented1;
	}

	public String toString() {
		// Concat the id and string
		return "ID " + id1 + ". " + name1;
	}

}