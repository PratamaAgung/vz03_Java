package animal;

public class OrangUtan extends LandAnimal implements Omnivora {
	private String suara = "Auooo";
	private int rasio_makanan = 15;
	
	/**
	 * Constructor
	 * @param id id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam gram
	 * @param jinak sifat animal apakah jinak atau tidak
	 */
	public OrangUtan(int id, int x, int y, int massa, boolean jinak) {
		super('O', id);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
	}
	/**
	 * Menampilkan interaksi berupa suara animal ke layar
	 */
	public void interact() {
		System.out.println("OrangUtan: \"" + suara + "\"");
	}
	/**
	 * Menampilkan makanan dari animal
	 */
	public void getTypeFood() {
		System.out.println("OrangUtan eats vegetables and meat");
	}

}
