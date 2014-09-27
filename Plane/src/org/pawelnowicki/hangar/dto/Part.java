package org.pawelnowicki.hangar.dto;

import java.util.ArrayList;

public class Part {
	
	private String name = "";
	private int quantity = 0;
	//TO DO
	//refactor into immutable list
	private ArrayList<Part> parts = new ArrayList<Part>();
	
	public Part(String name, int quantity) {
		this.setName(name);
		this.setQuantity(quantity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ArrayList<Part> getParts() {
		return parts;
	}

	public void setParts(ArrayList<Part> parts) {
		this.parts = parts;
	}
	
	
}
