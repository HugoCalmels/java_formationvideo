public final class _17_Pegasus extends _17_Horse {

  public _17_Pegasus(String name) {
    super(name); // fait référence au constructeur suppérieur, la classe parente.
    this.mPosZ = 100;
  }

  // on peut re-écrire la méthode "move" si elle est différente, et elle va overwrite l'autre native.
  
  public void fly(int z) {
    this.mPosZ = z;
    System.out.println("Le pégase s'eleve dans les airs ( Z = " + this.mPosZ + ")");
  }

  private int mPosZ;
}
