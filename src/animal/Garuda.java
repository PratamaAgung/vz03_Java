package animal;

/**
 * @class Garuda adalah turunan dari kelas FlyingAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */

public class Garuda extends FlyingAnimal implements Karnivora {
  private int rasioMakanan = 6;
  private String aksi = "spread wings, wuusshh!";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Garuda(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('G',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);  
  }
  
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Garuda ke layar.
   */
  public void interact() {
    System.out.println("Garuda: (" + aksi + ")");
  }
  
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("Garuda eats snake and another meat");
  }
}
