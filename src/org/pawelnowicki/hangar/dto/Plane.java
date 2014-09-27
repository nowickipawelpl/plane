package org.pawelnowicki.hangar.dto;

import java.util.ArrayList;

public class Plane {

	
	//TO DO
	//refactor into immutable list
	private ArrayList<Part> parts = new ArrayList<Part>();

	public ArrayList<Part> getParts() {
		return parts;
	}

	public void setParts(ArrayList<Part> planeParts) {
		this.parts = planeParts;
	}
}