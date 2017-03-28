package cage;
import java.util.*;
import animal.*;

public class Cage {
	private int luas;
	private final int id;
	private final char habitat;
	private Vector<Animal> animal;
	
	public Cage(int _id, char _habitat) {
		animal = new Vector();
		id = _id;
		habitat = _habitat;
	}
	
	//Blum Fix
	public void addAnimal(Animal _animal) {
		animal.addElement(_animal); 
	}
	
	public void addCell(char c) {
		if(habitat == c) {
			luas++;
		}
	}
	
	public int getId() {
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
