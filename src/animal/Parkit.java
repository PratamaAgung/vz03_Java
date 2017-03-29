package animal;

/**
 * @class Parkit.
 * Kelas Parkit turunan dari kelas FlyingAnimal meng-implement kelas Herbivora.
 * @author Iftitakhul Zakiah.
 */
public class Parkit extends FlyingAnimal implements Herbivora {
  private int rasioMakanan = 5;
  private String aksi = "cuit cuit";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Parkit(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('F',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa/rasioMakanan);  
  }

  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Parkit ke layar.
   */
  public void interact() {
    System.out.println("Parkit: (" + aksi + ")");
  }

  /**
   * implementasi seeVeggieType dari kelas Herbivora.
   */
  public void seeVeggieType() {
    System.out.println("Parkit eats any kind of seeds");
  }
}
