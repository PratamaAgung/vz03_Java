package cell;

/**
 * @author Pratamamia Agung Prihatmaja.
 */
public class Road extends Facility {
  private final int jenis;

  /**
   * Konstruktor dengan 2 parameter, untuk jenis jalan biasa.
   * @param absis lokasi absis dari Road.
   * @param ordinat lokasi Ordinat dari Road.
   */
  public Road(int absis, int ordinat) {
    super(' ', absis, ordinat);
    jenis = 0;
  }

  /**
   * Konstruktor dengan 3 parameter, untuk jenis entrance dan exit.
   * @param type menyatakan jenis dari Road.
   * @param absis lokasi absis dari Road.
   * @param ordinat lokasi ordinat dari Road.
   */
  public Road(int type, int absis, int ordinat) {
    super(' ', absis, ordinat);
    jenis = type;
  }

  /**
   * Getter dari data member jenis.
   * @return integer yang melambangkan jenis dari Road.
   */
  public int getJenis() {
    return jenis;
  }

  /**
   * Method untuk mencetak road ke layar.
   */
  public void render() {
    System.out.print("\u001B[32m" + type + "\u001B[0m");
  }
}
