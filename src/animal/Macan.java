package animal;

public class Macan extends LandAnimal implements Karnivora {
	private String aksi = "stalk prey";
	private int rasio_makanan = 12;
	
	/**
	 * Constructor
	 * @param id id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam gram
	 * @param jinak sifat animal apakah jinak atau tidak
	 */
	public Macan(int id, int x, int y, int massa, boolean jinak) {
		super('M', id);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
	}
	/**
	 * Menampilkan interaksi berupa suara animal ke layar
	 */
	public void interact() {
		System.out.println("Macan: (" + aksi + ")");
	}
	/**
	 * Menampilkan makanan dari animal
	 */
	public void getTypeFood() {
		System.out.println("Macan eats meat");
	}
}
