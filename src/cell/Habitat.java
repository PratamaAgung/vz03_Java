package cell;

/**
 * @author Pratamamia Agung Prihatmaja.
 */
public abstract class Habitat extends Cell{
  
  /**
   * Konstruktor kelas Cell.
   * @param type karakter simbol dari cell.
   * @param absis lokasi absis dari cell.
   * @param ordinat lokasi ordinat dari cell.
   */
  public Habitat (char type, int absis, int ordinat) {
    super(type, absis, ordinat);
  }
  
  /**
   * Method untuk mencetak habitat ke layar.
   */
  public void render() {
    if (animal != null) {
      
    } else {
      if(cage != null) {
        System.out.print((char) type - 32); 
      } else {
        System.out.print(type);
      }
    }
  }
}
