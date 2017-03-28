package zoo;
import java.util.*;
import cell.*;

public class Zoo {
	private final int width;
	private final int length;
	private Cell[][] cellArray;
	private Vector<Cell> entrance;
	private Vector<Cell> exit;
	
	public Zoo(int _width, int _length) {
		width = _width;
		length = _length;
		cellArray = new Cell[length][width];
		exit = new Vector<Cell>(25);
		entrance = new Vector<Cell>(25);
	}
	
	public void setCell(int _absis, int _ordinat, Cell cell) {
		cellArray[_ordinat][_absis]=cell;
	}
	
	public Cell getCell(int absis, int ordinat) {
		return cellArray[ordinat][absis];
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void addEntrance(Cell enter) {
		entrance.addElement(enter);
	}
	
	public void addExit(Cell ex) {
		exit.addElement(ex);
	}
	
	public Cell getEntrance(int idx) {
		return entrance.get(idx);
	}
	
	public Cell getExit(int idx) {
		return exit.get(idx);
	}
	
	public int nbEntrance() {
		return entrance.size();
	}
	
	public int nbExit() {
		return exit.size();
	}
}
