package animal;

public class Macan extends LandAnimal implements Karnivora {
  private String aksi = "stalk prey";
  private int rasioMakanan = 12;
  
  /**
   * Constructor.
   * @param id id animal yang diciptakan.
   * @param absis posisi animal di sumbu x.
   * @param ordinat posisi animal di sumbu y.
   * @param massa massa animal dalam gram.
   * @param jinak sifat animal apakah jinak atau tidak.
   */
  public Macan(int id, int absis, int ordinat, int massa, boolean jinak) {
    super('M', id);
    super.setX(absis);
    super.setY(ordinat);
    super.setJinak(jinak);
    super.setMakanan(massa / rasioMakanan);
  }

  /**
   * Menampilkan interaksi berupa suara animal ke layar.
   */
  public void interact() {
    System.out.println("Macan: (" + aksi + ")");
  }

  /**
   * Menampilkan makanan dari animal.
   */
  public void seeMeatType() {
    System.out.println("Macan eats meat");
  }
}
