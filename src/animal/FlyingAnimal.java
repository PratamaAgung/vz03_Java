package animal;

/** 
 * @class FlyingAnimal turunan dari kelas Animal.
   menunjukkan animal yang dapat terbang.
 * @author Iftitakhul Zakiah.
 */
public abstract class FlyingAnimal extends Animal {
  /**
   * Contsructor.
   * @param inisial inisial dari animal yang diciptakan.
   * @param id id animal yang diciptakan.
   */
  public FlyingAnimal(char inisial, int id) {
    super(inisial,id);
    super.addHabitat('x');
  }
}