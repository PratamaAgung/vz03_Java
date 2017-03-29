package animal;

/** 
 * @class Aligator.
 * Kelas Aligator turunan dari kelas LandWaterAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class Aligator extends LandWaterAnimal implements Karnivora {
  private int rasio_makanan = 100;
  private String aksi = "crawl";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param x posisi animal di sumbu x.
   * @param y posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Aligator(int id, int x, int y, int massa, boolean jinak) {
    super('L',id);
    super.setMassa(massa);
    super.setX(x);
    super.setY(y);
    super.setJinak(jinak);
    super.setMakanan(massa/rasio_makanan);
    
  }
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Aligator ke layar.
   */
  public void interact() {
    System.out.println("Aligator: (" + aksi + ")");
  }
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("Aligator eats any types meat");
  }
}
