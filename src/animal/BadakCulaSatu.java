package animal;

/** 
 * @class BadakCulaSatu.
   Kelas BadakCulaSatu turunan dari kelas LandAnimal meng-implement kelas Herbivora.
 * @author Annisa Muzdalifa.
 */

public class BadakCulaSatu extends LandAnimal implements Herbivora {
  private int rasioMakanan = 250;
  private String aksi = "bathing in mud";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public BadakCulaSatu(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('C',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan); 
  }

  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Badak ke layar.
   */
  public void interact() {
    System.out.println("BadakCulaSatu: (" + aksi + ")");
  }
  
  /**
   * implementasi getTypeFood dari kelas Herbivore.
   */
  public void seeVeggieType() {
    System.out.println("BadakCulaSatu eats grass");
  }
}