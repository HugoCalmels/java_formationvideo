public class VariablesEtConstantes03 {

  /*
  Un nommage de variable :
    - pas de caracteres spéciaux, pas d'espaces
    - commence une lettre ou underscore
    - camelCase pour une variable en plusieurs mots ( uneVariable ) et utilisé en Java.
    - mais les classes en Java sont en PascalCase
   */
  public static void main(String[] args) {

    // System.out.println("14");
    // ==> ne marcherait pas comme souhaité

    // Java est un langage de type fortement typé.
    // Spécifier le type de variable 

    int maPremiereVariable = 100;

    System.out.println(maPremiereVariable);

    maPremiereVariable = 300;

    System.out.println(maPremiereVariable);

    // portée des variables
    // généralement la portée d'une variable dépend de l'endroit dans laquelle elle a été déclarée


    // -- Les constantes -- //

    final int MAPREMIERECONSTANTE = 100;
    // final = const , car Java est un langage tres orientée POO et utilise final pour autre chose
    // que les constantes
    // par convention, on écrit toujours une constante en majuscules 

    System.out.println(MAPREMIERECONSTANTE);
  }

}
