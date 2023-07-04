public class _12_ChainesDeCaracteres {
  /*
    > concat()
    > length() 
    > toUpperCase(), toLowerCase()
    > trim() -- pour virer tous les espaces
    > chatAt(<index>)
    > subString(<index>, <nb>)  --> récupérer une sous chaine dans une chaine
    // par exemple depuis l'index 0, et 3 fois.
    > equals(<str>), compareTo(<str>)
  */
  public static void main(String[] args) {
  
    String s = "aefaef"; // String s = new String("aefaef");
    System.out.println(s); // --> "aefaef"

    // "String" est immuable (contenu non modifiable)
    // pourtant ..

    s = "zzzzz";
    System.out.println(s); // --> "zzzz"

    // en fait on crée une nouvelle chaine de caracteres String, et l'ancienne est supprimée.
    // donc modifier x1000 fois mon String, revient à créer x1000 Strings

    // --> Concaténation
    String s2 = "123123";

    System.out.println(s + "-" + s2);
    // --> méthode concat
    System.out.println(s.concat("-").concat(s2));
    // /!\ : Niveau performances --> plus rapide que l'opérateur + pour la concaténation

    System.out.println("----------------");

    // Relatif aux Strings : récupérer le premier caractere
    // System.out.println(s[0]); --> Erreur
    System.out.println(s.charAt(0)); // --> Nice.

    // subString
    System.out.println(s.substring(0, 3));

    // --- Comparer 2 chaines de caracteres String --- //
    // 1ere méthode
    // System.out.println(s == s2);
    System.out.println(s.equals(s2)); // --> False / true

    // 2eme méthode
    System.out.println(s.compareTo(s2)); // --> "73" !! MDR
    // --> retourne "0" si on a les même chaines
    // --> table ascii de "s" - table ascii de "s2"

  }
}
