package cage;
import java.util.*;

public class Cage {

	private int luas;
	private final int id;
	private final char habitat;
	Vector animal;
	
	public Cage(int _id, char _habitat) {
		animal = new Vector();
		id=_id;
		habitat=_habitat;
	}
	
	//Blum Fix
	public void addAnimal(int _animal) {
		boolean feasible = false;
		int i = 0;
		animal.addElement(_animal); 
	}
	
	public void addCell(char c) {
		if(habitat==c) {
			luas++;
		}
	}
	
	public int getID() {
		return id;
	}
	
	public int getLuas() {
		return luas;
	}
	
	public int getNbAnimal() {
		return animal.size();
	}
	
	public char getHabitat() {
		return habitat;
	}
	
	private boolean isAvailable() {
		return getNbAnimal()<(3*luas/10);
	}
	
	//Blum Fix
	private boolean isIsiJinak() {
		return true;
	}
}
