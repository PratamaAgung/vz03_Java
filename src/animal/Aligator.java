package animal;

/** 
 * @class Aligator.
   Kelas Aligator turunan dari kelas LandWaterAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class Aligator extends LandWaterAnimal implements Karnivora {
  private int rasioMakanan = 100;
  private String aksi = "crawl";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Aligator(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('L',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
    
  }
  
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Aligator ke layar.
   */
  public void interact() {
    System.out.println("Aligator: (" + aksi + ")");
  }
  
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("Aligator eats any types meat");
  }
}
