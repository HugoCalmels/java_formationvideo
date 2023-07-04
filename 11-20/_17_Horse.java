public class _17_Horse {
  public _17_Horse(String name, int x) /* throw Exception ( si justifié et dispensable )*/{
    this.mName = name;
    this.mPosX = 50;
    this.mPosY = 50;
    if (x < 0) {
      // lever manuellement une exception
      throw new Exception("Valeur de X incorrecte"); // sympa
    }
  }

  // aussi indiquer les valeurs ici vu qu'on les changera pas sur les classes enfant
  // exemple : public void move( final int x, final int y)
  public void move(int x, int y) {
    this.mPosX = x;
    this.mPosY = y;
    System.out.println("Le cheval se déplace (X = " + this.mPosX + ", Y = " + this.mPosY + ")");
  }

  private String mName;
  private int mPosX;
  private int mPosY;
  final private int someRandomvalue;

}
