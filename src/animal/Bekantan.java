package animal;

/** 
 * @class Bekantan turunan dari kelas LandAnimal meng-implement kelas Omnivora.
 * @author Annisa Muzdalifa.
 */

public class Bekantan extends LandAnimal implements Omnivora {
  private int rasioMakanan = 10;
  private String aksi = "climb tree";

  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public Bekantan(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('B',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa/rasioMakanan);  
  }

  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Bekantan ke layar.
   */
  public void interact() {
    System.out.println("Bekantan: (" + aksi + ")");
  }

  /**
   * implementasi getTypeFood dari kelas Omnivore.
   */
  public void seeFoodType() {
    System.out.println("Bekantan eats lots of fruit and sometimes insects");
  }
}
