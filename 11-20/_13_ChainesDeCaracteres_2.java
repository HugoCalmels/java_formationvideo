import java.util.StringTokenizer; // --> permet de split une chaine de caracteres

// String
  
// StringBuilder/StringBuffer : muable ( contenu modifiable )
// > length(), capacity()
// > append(), insert(<index>, <string>) --> append au début


public class _13_ChainesDeCaracteres_2 {
  public static void main(String[] args) {
    String s = "new/titre-de-la-news/14";
    StringTokenizer st = new StringTokenizer(s, "/");
    StringTokenizer st2 = new StringTokenizer(s, "/", true); // pour obtenir le "/" aussi
    // exactement comme un split, avec le 2nd argument qui prend le charactere ou split
    System.out.println(st); // --> java.util.StringTokenizer@d716361
    // --> il me sort l'objet brut...

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    // --- StringBuilder / StringBuffer --- //
    // --> des string muables ? contrainement à String qui est immuable.

    StringBuilder sBuilder = new StringBuilder();
    StringBuilder sBuilder2 = new StringBuilder("Salut tout le monde!!!");
    StringBuilder sBuilder3 = new StringBuilder();

    // .length()
    System.out.println(sBuilder.length()); // .length() // --> "0" makes sense so far ..

    // .capacity() --> le nombre de caracteres possibles en plus
    System.out.println(sBuilder.capacity()); // --> "16" ?? WTF why ??
    System.out.println(sBuilder2.length());// --> "21" 
    System.out.println(sBuilder2.capacity()); // --> "37" (21 + 16)

    // /!\ pas trop compris à quoi ca sert le .capacity()

    System.out.println("-----------");

    // .append()
    sBuilder.append("Bonjour");
    System.out.println(sBuilder);
    sBuilder.append("tout le monde");
    System.out.println(sBuilder);

    System.out.println("-----------");

    // .insert()
    sBuilder3.append("tout le monde");
    sBuilder3.insert(0, "Bonjour");
    System.out.println(sBuilder3);

    // StringBuffer : le meme fonctionnement
    StringBuffer sBuffer = new StringBuffer();
    sBuffer.append("toto le string buffer");
    System.out.println(sBuffer);

    // ------------ Monothreadé / Synchrone / Asynchrone ------------ //

    // Monothreadé : 1 seul thread
    // StringBuilder - Asynchrone 
    // --> A utiliser principalement

    // Multithreadé : plusieurs threads
    // StringBuffer - Synchrone 
    // --> Peut etre lent

    // ---- Concat #2 ---- //
    String s2 = "a";
    String s3 = "b";
    String res = s2.concat(s3);
    // --> StringBuilder sb3 = new StringBuilder(s2).append(s3).toString(); == s2.concat(s3);
    // Encore un fois mono trhead avec des append le plus rapide.

    // La difficulté du Java --> Quelle classe utiliser dans quel contexte, vis à vis de la performance
  }
}
