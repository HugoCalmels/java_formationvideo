public class SoftwareRegistery_10 {
  // chaque classe va posseder ses attributs et on ne veut pas manipuler n'importe comment
  // ces attributs en dehors de la classe

  // GETTERS -- access a un attribut (lecture)
  // SETTERS -- modification de l'attribut

  public SoftwareRegistery_10(int expiration) {
    this.mExpirationYear = expiration;

    System.out.println("Enregistrement du produit, valide jusqu'en " + this.mExpirationYear);

     // variable commune à sr et sr2, mais pourquoi ? ==> variable de classe
    if (mNumberOfRegistrations > 0) {
      this.mExpirationYear = expiration;
      mNumberOfRegistrations--;
      System.out.println("Logiciel valide (expiration :" + this.mExpirationYear + ")");
    } else {
      System.out.println("Maximum de validations effectuées");
    }
  }
  
  int mExpirationYear;

  // faire un GETTER
  public int getExpirationYear() {
    return this.mExpirationYear;
  }

  // faire un SETTER ( ne retourne rien donc void )
  public void setExpirationYear(int expiration) {
    this.mExpirationYear = expiration;

  }

  // variable de classe ( qui sera commune à toutes les instances de l'objet )
  private static int mNumberOfRegistrations = 5;
}
