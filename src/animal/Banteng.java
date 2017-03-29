package animal;

/**
 * @class Banteng turunan LandAnimal dan implement Herbivora.
 * @author Annisa Muzdalifa.
 */
public class Banteng extends LandAnimal implements Herbivora {
  private int rasioMakanan = 100;
  private String aksi = "snort";
  
  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Banteng(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('A',id);
    super.setMakanan(massa/rasioMakanan);
    super.setMassa(massa);
    super.setJinak(jinak);
    super.setX(absis);
    super.setY(ordinat);
  }

  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Badak ke layar.
   */
  public void interact() {
    System.out.println("Banteng: (" + aksi + ")");
  }

  /**
   * implementasi seeVeggieType dari kelas Herbivore.
   */
  public void seeVeggieType() {
    System.out.println("Banteng eats grass");
  }
}
