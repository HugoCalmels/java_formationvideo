public class _18_Tiger extends _18_LivingSpecies { // héritage de LivingSpecies
  public _18_Tiger() {
    mName = "Tiger";
  }
  
  public void eat() {
    // obligé d'implémenter les méthodes abstraites de la classe parente
    System.out.println("Je mange de la viande...");
  }
  
  public void speak() {
    // obligé d'implémenter les méthodes abstraites de la classe parente
    System.out.println("Je rugis..");
  }
}
