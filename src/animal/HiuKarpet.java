package animal;

/**
 * @class HiuKarpet.
   Kelas HiuKarpet turunan dari kelas WaterAnimal meng-implement kelas Karnivora.
 * @author Iftitakhul Zakiah.
 */
public class HiuKarpet extends WaterAnimal implements Karnivora {
  private int rasioMakanan = 100;
  private String aksi = "burying in sand";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public HiuKarpet(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('V',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan); 
  }

  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi HiuKarpet ke layar.
   */
  public void interact() {
    System.out.println("HiuKarpet: (" + aksi + ")");
  }
  
  /**
   * implementasi seeMeatType dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("HiuKarpet eats another fish");
  }
}
