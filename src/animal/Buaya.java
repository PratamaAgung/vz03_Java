package animal;

/**
 * @class Buaya.
   Kelas Buaya turunan dari kelas LandWaterAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class Buaya extends LandWaterAnimal implements Karnivora {
  private int rasioMakanan = 200;
  private String aksi = "open mouth";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Buaya(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('D',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
    
  }
  
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Buaya ke layar.
   */
  public void interact() {
    System.out.println("Buaya: (" + aksi + ")");
  }
  
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("Buaya eats any kinds of meat");
  }
}