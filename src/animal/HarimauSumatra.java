package animal;

/**
 * @class HarimauSumatra turunan dari LandAnimal dan implement Karnivora.
 * @author Annisa Muzdalifa.
 */
public class HarimauSumatra extends LandAnimal implements Karnivora {
  private int rasioMakanan = 12;
  private String suara = "AUMM";
  
  /**
   * Constructor.
   * @param id Id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam satuan gram.
   * @param jinak sifat animal yang menyatakan jinak atau tidak.
   */
  public HarimauSumatra(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('H',id);
    super.setMassa(massa);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
    
  }
  
  /**
   * implementasi interact dari kelas Animal. Menampilkan aksi Harimau ke layar.
   */
  public void interact() {
    System.out.println("Harimau Sumatra: \"" + suara + "\"");
  }
  
  /**
   * implementasi getTypeFood dari kelas Karnivora.
   */
  public void seeMeatType() {
    System.out.println("HarimauSumatra eats meat");
  }

}
