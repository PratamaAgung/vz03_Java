package animal;

/**
 * @class Kancil turunan dari LandAnimal dan implement Herbivora.
 * @author Annisa Muzdalifa.
 */
public class Kancil extends LandAnimal implements Herbivora {
  private String aksi = "eat cucumber";
  private int rasioMakanan = 2;
  
  /**
   * Constructor.
   * @param id id dari animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public Kancil(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('K', id);
    super.setMakanan(massa / rasioMakanan);
    super.setMassa(massa);
    super.setJinak(jinak);
    super.setX(absis);
    super.setY(ordinat);
  }
  
  /**
   * Menampilkan interaksi berupa suara animal ke layar.
   */
  public void interact() {
    System.out.println("Kancil: (" + aksi + ")");
  }
  
  /**
   * Menampilkan makanan dari animal.
   */
  public void seeVeggieType() {
    System.out.println("Kancil eats grass");
  }
  

}
