public class Constructeur_09bis {
  public static void main(String[] args) {
    // je veux créer plusieurs Players 
    // Player p1 = new Player(); --> pas de nom précisé
    // Player p2 = new Player("hugo"); --> avec un nom
    // Player p3 = new Player("hugo", 3); --> un nom, un niveau par exemple
    // je veux que les trois soient possibles 

    // A noter qu'on type par player "Player p1 = something"

    Player_09bis p1 = new Player_09bis();
    Player_09bis p2 = new Player_09bis("Hugo");
    Player_09bis p3 = new Player_09bis("Hugo", 15);

    p1.attack();
  }
}
