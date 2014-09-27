package org.Pawe³Nowicki.hangar.ui;

import org.pawelnowicki.hangar.dto.Part;
import org.pawelnowicki.hangar.dto.Plane;

public class Hangar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hangar hangar = new Hangar();
		Plane plane = hangar.createPlane();
		hangar.showPlane(plane);
	}
	
	public Plane createPlane () {
		Plane plane = new Plane();
		Part engine = new Part("engine", 1);
		Part bolt = new Part("bolt", 20);
		Part bolt2 = new Part("bolt2", 13);
		Part wing = new Part("wing", 2);
		engine.getParts().add(bolt);
		plane.getParts().add(engine);
		plane.getParts().add(wing);
		bolt.getParts().add(bolt2);
		
		return plane;
	}
	
	public void showPlane(Plane plane) {
		System.out.println("Plane");
		for(Part part : plane.getParts()){
			showPart(part, "\t");
		}
	}
	
	private void showPart(Part part, String tab) {
		//TODO: use String formatting
		System.out.println(tab + part.getName() + " x" + part.getQuantity());
		if(part.getParts().size() > 0) {
			String newTab = tab + "\t";
			for(Part subpart : part.getParts()){
				showPart(subpart, newTab);
			}
		}
	}
}
