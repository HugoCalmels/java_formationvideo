public class Player_09bis {
  public Player_09bis(){
    this.mName ="Inconnu";
    this.mLevel = 1;
    System.out.println(this.mName + " - " + this.mLevel );
  }
  // --> Surcharge de méthodes

  public Player_09bis(String name){
    this.mName = name;
    this.mLevel = 1;
    System.out.println(this.mName + " - " + this.mLevel );
  }

  public Player_09bis(String name, int level) {
    this.mName = name;
    this.mLevel = level;
    System.out.println(this.mName + " - " + this.mLevel);
  }
  
  // faire une action qui appartient à la classe joueur, sans le mot clef static
  // static = utilisable sans instancier la classe
  // en l'occurence on ne veut pas faire de méthode 'attack' si le joueur n'a pas été crée
  public void attack() {
    System.out.println(this.mName + "attaque une cible !");
  }

  private String mName;
  private int mLevel;
}
