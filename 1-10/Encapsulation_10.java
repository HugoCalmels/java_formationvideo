class Encapsulation_10 { // nom du fichier
  public static void main(String[] args) {
    SoftwareRegistery_10 sr = new SoftwareRegistery_10(2020);

    sr.mExpirationYear = 2050;
    System.out.println(sr.mExpirationYear);
    // ==> on voit qu'on peut changer facilement l'attribut en dehors de la classe.
    // En POO dans la majorité des langages on va procéder à "L'encapsulation des données",
    // pour fix un status sur le changement de données de la classe.

    // utiliser le getters hors classe 
    sr.setExpirationYear(2009);
    // utiliser le setter hors classe
    System.out.println(sr.getExpirationYear());

    // du coup ce qui est pratique c'est qu'on peut changer la méthode dans la classe, et cela
    // s'appliquera à toutes les instances de l'object

    // autre instance 
    SoftwareRegistery_10 sr2 = new SoftwareRegistery_10(2022);
    // ==> chaque instance a ses propres attributs

    // sr ==> 2020
    // sr2 ==> 2022


    // variable commune à sr et sr2, mais pourquoi ? ==> variable de classe
  
    SoftwareRegistery_10 sr3 = new SoftwareRegistery_10(2022);
  }

}
