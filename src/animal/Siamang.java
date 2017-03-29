package animal;

/**
 * @class Siamang turunan LandAnimal dan implement Omnivora.
 * @author Annisa Muzdalifa.
 *
 */

public class Siamang extends LandAnimal implements Omnivora {
  private String suara = "Ooo Ooo";
  private int rasioMakanan = 5;
  
  /**
   * Constructor.
   * @param id id animal yang diciptakan.
   * @param x posisi animal di sumbu x.
   * @param y posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public Siamang(int id, int x, int y, int massa, boolean jinak) {
    super('S', id);
    super.setX(x);
    super.setY(y);
    super.setJinak(jinak);
    super.setMakanan(massa/rasioMakanan);
  }
  
  /**
   * Menampilkan interaksi berupa suara animal ke layar.
   */
  public void interact() {
    System.out.println("OrangUtan: \"" + suara + "\"");
  }

  /**
   * Menampilkan makanan dari animal.
   */
  public void seeFoodType() {
    System.out.println("Siamang eats lots of food and sometimes insect");
  }
}
