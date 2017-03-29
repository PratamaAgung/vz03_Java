package animal;

/**
 * @class StingRay.
   Kelas StingRay turunan dari kelas WaterAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class StingRay extends WaterAnimal implements Karnivora {
  private int rasioMakanan = 10;
  private String aksi = "move fin";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public StingRay(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('Y',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
  }

  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi StingRay ke layar.
   */
  public void interact() {
    System.out.println("StingRay: (" + aksi + ")");
  }

  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("StingRay eats another fish");
  }
}
