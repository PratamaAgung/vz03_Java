package animal;

/**
 * @class Zebra turunan LandAnimal dan implement Herbivora.
 * @author Annisa Muzdalifa.
 */
public class Zebra extends LandAnimal implements Herbivora {
  private String aksi = "running";
  private int rasioMakanan = 60;
  
  /**
   * Constructor.
   * @param id id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public Zebra(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('Z', id);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
  }
  
  /**
   * Menampilkan interaksi berupa suara animal ke layar.
   */
  public void interact() {
    System.out.println("Zebra: (" + aksi + ")");
  }
  
  /**
   * Menampilkan makanan dari animal.
   */
  public void seeVeggieType() {
    System.out.println("Zebra eats grass");
  }

}
