package animal;

/**
 * @class Komodo turunan LandAnimal dan implement Karnivora.
 * @author Annisa Muzdalifa.
 *
 */
public class Komodo extends LandAnimal implements Karnivora {
  private String aksi = "stick tongue";
  private int rasioMakanan = 10;
  
  /**
   * Constructor.
   * @param id id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public Komodo(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('J', id);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
  }
  
  /**
   * Menampilkan interaksi berupa suara animal ke layar.
   */
  public void interact() {
    System.out.println("Komodo: (" + aksi + ")");
  }
  
  /**
   * Menampilkan makanan dari animal.
   */
  public void seeMeatType() {
    System.out.println("Komodo eats any kind of meat");
  }

}
