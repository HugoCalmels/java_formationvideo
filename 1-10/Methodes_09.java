public class Methodes_09 {
  public static void main(String[] args) {
    // une méthode c'est le nom qu'on donne à une fonction concernant de la POO
    // --> une méthode pour éviter de répéter de repeter du code --> factoriser

    prog(); // textes ...

    System.out.println(getNumberTwo()); // 2

    System.out.println(getNumber());

    say("Hello test de message fn avec parametres");

    // --- La surchage de méthode en Java --- //
      
    System.out.println(sum(2, 5)); // --> entiers
    System.out.println(sum(2.3, 5.6)); // --> flottants
  }

  public static void prog() { // note : une méthode ne doit faire qu'une seule chose à la fois.
    System.out.println("texte 1");
    System.out.println("texte 2");
    System.out.println("texte 3");
  }
  // des méthodes statiques et publiques en tout ce qui concerne notre class principale

  // -- méthode avec parametre -- //
  public static String say(String message) {
    return message;
  }

  // --- Methode 2 : avec une valeur de retour

  public static int getNumberTwo() { // retourne un entier, c'est typé
    return 2;
  }
  
  public static int getNumber() {
    boolean info = false;

    if (info) {
      return 1;
    } else {
      return 0;
    }
  }

  // --- Surchage de méthode --- //

  public static int sum(int a, int b) {
    return a + b;
  }
  public static double sum(double a, double b) {
    return a + b;
  }




}
