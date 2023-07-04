import mypack.*; // ".*" spécifie que l'on importe toute les classes de ce fichier
// ou import mypack._14_Player --> pour la classe Player
  // note : si je veux utiliser un nom appartenant déjà à une classe native de Java
  // il suffit d'utiliser "_" à la fin par exemple : "import mypackage_.java"
  // le mot est néanmoins de ne pas utiliser de mots réservés.

  // note 2 : créer son paquet avec "package mypackage"

  // note 3 : mypack c'est un dossier racine dans lequel on a ses classes.
  // --> attention a pas tout mettre dans le meme dossier, car package va créer automatiquement un dossier
  
public class _14_Paquets {
  public static void main(String[] args) {
    // comment créer des modules ou packages pour avoir différentes classes

    _14_Player p = new _14_Player();
    _14_Item it = new _14_Item();
  }
}
