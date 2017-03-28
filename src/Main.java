import cell.*;

public class Main {
	public static void main(String[] args) {
		Cell c;
		
		c= new Entrance(2, 3);
		System.out.println(c.getClass()+" "+c.getAbsis()+" "+c.getOrdinat());
	}
}
