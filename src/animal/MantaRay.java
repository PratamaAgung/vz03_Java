package animal;

/**
 * @class MantaRay.
   Kelas MantaRay turunan dari kelas WaterAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class MantaRay extends WaterAnimal implements Karnivora {
  private int rasioMakanan = 400;
  private String aksi = "Swim! Jump!";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public MantaRay(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('Q',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);  
  }
  
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi MantaRay ke layar.
   */
  public void interact() {
    System.out.println("MantaRay: (" + aksi + ")");
  }
  
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("MantaRay eats another fish");
  }
}
