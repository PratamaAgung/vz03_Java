package animal;

/**
 * @class Iguana turunan dari LandAnimal dan implement Herbivora .
 * @author nim_13515090.
 */
public class Iguana extends LandAnimal implements Herbivora {
  private int rasioMakanan = 8;
  private String suara = "Hiss";  
  
  /**
   * Consturctor.
   * @param i Id animal.
   * @param absis Posisi animal di sumbu x.
   * @param ordinat Posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public Iguana(int i, int absis, int ordinat, int massa, boolean jinak) {
    super('I',i);
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
    System.out.println("Iguana: \"" + suara + "\"");
  }
  
  /**
   * Menampilkan makanan dari animal.
   */
  public void seeVeggieType() {
    System.out.println("Iguana eats vegetables and fruits");
  }

}
