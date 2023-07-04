public class _11_Tableaux {
  public static void main(String[] args) {
    // java = langage de haut niveau = langage proposant des fonctionnalités supplémentaires, telles
    // la gestion de la mémoire

    // un tableau qui permet de stocker 3 données de type int
    int tableau[] = new int[3];
    // int[]tableau2, tableau3 = new int[3]; --> faire plusieurs tableaux sur 1x ligne

    // un tableau avec 3 entiers qui sont définis et dans cet ordre
    int tableau2[] = new int[] { 1, 2, 3 };
    // la meme chose 
    int tableau3[] = { 1, 2, 3 };

    // ==> Java : langage tres verbeux, il y a plusieurs moyens de déclarer les choses

    // ---- Travailler avec les tableaux ---- //
    // A quoi ca ressemble ?
    System.out.println(tableau2);
    // ==> "[I@d716361"
    // ==> ca ressemble à rien !!!

    //  --> Accéder aux élements du tableau <--

    // 1er élément du tableau
    System.out.println(tableau2[0]);

    System.out.println("-----------");

    // Afficher tous les élements d'un tableau #1
    for (int i = 0; i < tableau2.length; i++) {
      System.out.println(tableau2[i]); // --> très chiant ça.
    }

    System.out.println("------------");

    // Affichier tous les éléments d'un tableau #2
    // pour chaque élement de tableau2 que tu va stocker temporairement, a chaque tour de la boucle
    for (int el : tableau2) {
      System.out.println(el); // el = 1 par exemple
    }

    System.out.println("------------");

    // --- /!\ Tableau à 2 dimension : c'est quoi ça ? --- //
    int[][] tableau4 = { { 1, 2, 3 }, { 4, 5, 6 } };
    // un tableau à 2 dimensions c'est un tableau dans lequel il y a un ou plusieurs tableaux
    // --> trigger de déclarer des tableaux avec ça "{}"

    // Afficher un tableau à 2 dimensions : le cauchemard

    for (int[] i : tableau4) { // ==> int[] et pas non int
      for (int z : i) { // 
        System.out.println(z);
      }
    }

    for (int i = 0; i < tableau4.length; i++) {
      for (int z = 0; z < tableau4[i].length; z++) {
        System.out.println(tableau4[i][z]); // hé bah putain ..
      }
    }

    System.out.println("------------");

    // --> travailler avec des tableaux dans des méthodes <-- //

    int[] tableau5 = { 0, 1, 2, 3, 4, 5, 6, 7 };
    printTab(tableau5);

    // -- Object en Java : représente un objet tel qu'il soit en Java -- //
    // --> le tableau est un objet, donc il hérite des méthodes d'un objet en plus de celles d'un tableau
    
  }
  
  // --> une méthode simple est liée à une instance spécifique d'une classe
  // --> une méthode statique(méthode de classe) est liée à la classe elle memme
  public static void printTab(int[] tab) { // on attend un tableau avec des données de type int
    for (int element : tab) {
      System.out.println(element);
    }
  }
}
