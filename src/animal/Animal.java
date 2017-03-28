package animal;
/**
 * @class Animal merepresentasikan binatang yang berada di Zoo 
 * @author Annisa Muzdalifa
 */
public abstract class Animal {
  private int x;
  private int y;
  private int massa;
  private int jumlah_makanan;
  private boolean jinak;
  private int id;
  private char inisial;
  private String type;

  /** 
   * Constructor
   */
  public Animal(char c, int i) {
  	inisial = c;
  	id = i;
  }
  /** 
   * @return apakah binatang jinak atau tidak
   */
  public boolean isJinak() {
  	return jinak;
  }
  /** 
    * @return inisial object Animal
    */
  public char getInisial() {
  	return inisial;
  }
  /**
    * @return ID
    */
  public int getId() {
  	return id;
  }
  /** 
    * @return massa
    */
  public int getMassa() {
  	return massa;
  }
  /** 
    * @return x
    */
  public int getPosisiX() {
  	return x;
  }
  /**
   * @return y
   */
  public int getPosisiY() {
  	return y;
  }
  /** 
    * @return type
    */
  public String getHabitat() {
  	return type;
  }
  /**
   * @return Nilai makanan yang diperlukan animal
   */
  public int getJmlMakanan() {
	  return jumlah_makanan;
  }
  /** 
   * @param _jinak Nilai jinak Animal yang ingin dimasukkan 
   */
  public void setJinak(boolean _jinak) {
  	jinak = _jinak;
  }
  /**
   * @param kg Nilai massa animal yang ingin dimasukkan
   */
  public void setMassa(int kg) {
  	massa = kg;
  }
  /**
   * @param gram Nilai makanan animal yang ingin dimasukkan
   */
  public void setMakanan(int gram) {
  	jumlah_makanan = gram;
  }
  /** 
    * @param _x Nilai posisi x animal yang ingin dimasukkan
    */
  public void setX(int absis) {
  	x = absis;
  }
  /** 
   * @param _y Nilai posisi y animal yang ingin dimasukkan
   */
  public void setY(int ordinat) {
  	y = ordinat;
  }
  /** 
   * @param c nilai habitat animal yang ingin ditambahkan ke type
   */
  public void addHabitat(char c) {
  	type += 'c';
  }
  /** 
   * menampilk
   * an inisial animal ke layar
   */
  public void render() {
  	System.out.println(inisial);
  }
  /** 
   * Menampilkan interaksi animal ke layar 
   */
  public abstract void interact();
}