package animal;

/**
 * @class Animal merepresentasikan binatang ordinatang berada di Zoo.
 * @author Annisa Muzdalifa.
 */

public abstract class Animal {
  private int absis;
  private int ordinat;
  private int massa;
  private int jumlahMakanan;
  private boolean jinak;
  private int id;
  private char inisial;
  private String tordinatpe;

  /** 
   * Constructor.
   */
  public Animal(char c, int i) {
    inisial = c;
    id = i;
  }

  /** 
   * @return apakah binatang jinak atau tidak.
   */

  public boolean isJinak() {
    return jinak;
  }

  /** 
    * @return inisial object Animal.
    */
  public char getInisial() {
    return inisial;
  }

  /**
    * @return ID.
    */
  public int getId() {
    return id;
  }

  /** 
    * @return massa.
    */
  public int getMassa() {
    return massa;
  }

  /** 
    * @return absis.
    */
  public int getPosisiabsis() {
    return absis;
  }

  /**
   * @return ordinat.
   */
  public int getPosisiordinat() {
    return ordinat;
  }

  /** 
    * @return type.
    */
  public String getHabitat() {
    return type;
  }

  /**
   * @return Nilai makanan yang diperlukan animal.
   */
  public int getJmlMakanan() {
    return jumlahMakanan;
  }

  /** 
   * @param jinak1 Nilai jinak Animal yang ingin dimasukkan.
   */
  public void setJinak(boolean jinak1) {
    jinak = jinak1;
  }

  /**
   * @param kg Nilai massa animal yang ingin dimasukkan.
   */
  public void setMassa(int kg) {
    massa = kg;
  }

  /**
   * @param gram Nilai makanan animal yang ingin dimasukkan.
   */
  public void setMakanan(int gram) {
    jumlahMakanan = gram;
  }

  /** 
    * @param absis Nilai posisi absis animal yang ingin dimasukkan.
    */
  public void setabsis(int absis) {
    absis = absis;
  }

  /** 
   * @param ordinat Nilai posisi ordinat animal yang ingin dimasukkan.
   */
  public void setordinat(int ordinat) {
    ordinat = ordinat;
  }

  /** 
   * @param kar nilai habitat animal yang ingin ditambahkan ke type.
   */
  public void addHabitat(char kar) {
    type += kar;
  }

  /** 
   * menampilkan inisial animal ke layar.
   */
  public void render() {
    System.out.println(inisial);
  }

  /** 
   * Menampilkan interaksi animal ke layar.
   */
  public abstract void interact();
}