package animal;

/**
 * @class Elang.
   Kelas Elang turunan dari kelas FlyingAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class Elang extends FlyingAnimal implements Karnivora {
  private int rasioMakanan = 5;
  private String aksi = "Kaaaak!";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Elang(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('~',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
    
  }
  
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Elang ke layar.
   */
  public void interact() {
    System.out.println("Elang: (" + aksi + ")");
  }
  
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("Elang eats snake and another meat");
  }
}