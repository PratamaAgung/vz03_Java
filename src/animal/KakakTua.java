package animal;

/**
 * @class KakakTua.
   Kelas KakakTua turunan dari kelas FlyingAnimal meng-implement kelas Herbivora.
 * @author Iftitakhul Zakiah.
 */
public class KakakTua extends FlyingAnimal implements Herbivora {
  private int rasioMakanan = 3;
  private String aksi = "Hello! kwaak!";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public KakakTua(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('P',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
    
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
