package animal;

/**
 * @class HarimauSumatra turunan dari LandAnimal dan implement Karnivora
 * @author Annisa Muzdalifa
 */
public class HarimauSumatra extends LandAnimal implements Karnivora {
	private int rasio_makanan = 12;
	private String suara = "AUMM";
	/**
	 * Constructor
	 * @param id Id animal yang diciptakan
	 * @param x posisi animal di sumbu x
	 * @param y posisi animal di sumbu y
	 * @param massa massa animal dalam satuan gram
	 * @param jinak sifat animal yang menyatakan jinak atau tidak
	 */
	public HarimauSumatra(int id, int x, int y, int massa, boolean jinak) {
		super('H',id);
		super.setMassa(massa);
		super.setX(x);
		super.setY(y);
		super.setJinak(jinak);
		super.setMakanan(massa/rasio_makanan);
	}
	/**
	 * implementasi interact dari kelas Animal. Menampilkan aksi Harimau ke layar
	 */
	public void interact() {
		System.out.println("Harimau Sumatra: \"" + suara + "\"");
	}
	/**
	 * implementasi getTypeFood dari kelas Karnivora.
	 */
	public void getTypeFood() {
		System.out.println("HarimauSumatra eats meat");
	}

}