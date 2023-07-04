public class _17_Heritage {
  // Heritage : créer une relation entre 2 classes

  // En Java comme dans la majorité des langages POO, toute classe appartient à Object,
  // donc elle hérite des méthodes de Object.

  // on voit le truc venir :
  // --> on veut que Pegasus hérite des attributs et méthodes de Horse

  // on pourrait représenter les classes par une arbre
  // Object >> Horse >> Pegasus
  public static void main(String[] args) {
    _17_Horse h = new _17_Horse("Alezan");
    h.move(61, 185);

    _17_Pegasus p = new _17_Pegasus("Roger");
    p.move(1235, 55);
    p.fly(353);

    // vérifier si un oject est propre à une instance particuliere
    if (p instanceof Pegasus) {
      System.out.println("C'est un pégase");
    }
    
    // empecher de faire de Extends de Pegasus ? pk pas.
    // --> mot clef : final
  }
}
