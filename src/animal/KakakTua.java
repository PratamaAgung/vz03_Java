package animal;

/**
 * @class KakakTua.
 * Kelas KakakTua turunan dari kelas FlyingAnimal meng-implement kelas Herbivora.
 * @author Iftitakhul Zakiah.
 */
public class KakakTua extends FlyingAnimal implements Herbivora {
  private int rasio_makanan = 3;
  private String aksi = "Hello! kwaak!";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param x posisi animal di sumbu x.
   * @param y posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public KakakTua(int id, int x, int y, int massa, boolean jinak) {
    super('P',id);
    super.setMassa(massa);
    super.setX(x);
    super.setY(y);
    super.setJinak(jinak);
    super.setMakanan(massa/rasio_makanan);
    
  }
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi KakakTua ke layar.
   */
  public void interact() {
    System.out.println("KakakTua: (" + aksi + ")");
  }
  /**
   * implementasi seeVeggieType dari kelas Herbivora.
   */
  public void seeVeggieType() {
    System.out.println("KakakTua eats any kind of seed");
  }
}
