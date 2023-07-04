public class Cat_07 {
  public Cat_07(String name, int age) {
    System.out.println("Je suis un chat : " + this);
    // this qui fait référence à l'object que je viens de crée
    // l'instance en cours en gros quoi

    // Je suis un chat : Cat_07@372f7a8d
    // il envoie le console log direct à la création de l'object

    // a compléter avec le constructeur
    this.mName = name;
    this.age = age;

    // vérif que les infos ont bien été enregistrées
    System.out.println(this.mName + " - " + this.age);
  }

  ///////////////// ----- Attributs ----- /////////////// --> variable membre d'une classe
  // spécifier le type
  // String mName;
  // int age;
  // par default en private --> autant le faire à la main pour bien expliquer
  private String mName;
  private int age;
  // a partir de là on modifie le constructeur
}
