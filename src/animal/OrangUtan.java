package animal;

/**
 * @class OrangUtan turunan LandAnimal dan implement Omnivora.
 * @author Annisa Muzdalifa.
 */
public class OrangUtan extends LandAnimal implements Omnivora {
  private String suara = "Auooo";
  private int rasioMakanan = 15;
  
  /**
   * Constructor.
   * @param id id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public OrangUtan(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('O', id);
    super.setX(absis);
    super.setY(ordinat);
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
    System.out.println("OrangUtan eats lots of fruit and sometimes insects");
  }

}
