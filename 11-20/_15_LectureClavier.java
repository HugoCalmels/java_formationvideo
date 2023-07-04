// il faut importer BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class _15_LectureClavier {
  // La saisie de données par l'utilisateur, au clavier, le prompt
  public static void main(String[] args) throws Exception { 
    //BufferedReader br = new BufferedReader();
    // permet de lire des chaines de caracteres de type string
    // synchronisé et thread safe
    // --> tampon de 8192 caracteres
    // --> lire des caracteres sans vérifier le type

    //Scanner sc;
    // pas thread safe, asynchrone, not thread safe = plus lent 
    // lecture de données int, string, boolean, tableau
    // + analyse des données ( parsing ), opération tres couteuse
    // --> tampon de 1024 caracteres
    // --> vérifier le type

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    // one line : BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

    System.out.println("Comment t'appelles tu ?");
    String name = br.readLine(); // --> error sans "throws Exception" 
    // cette méthode va pas forcement faire ce que j'attends, donc il faut lever une exception
    // le prompt en soi c'est le readLine()
    System.out.println(name);

    // quelques méthodes BufferedReader :
    // > read(); lire un caractere
    // > readLine(); lire une chaine
    // > skip(N) : ingore N caracteres

    // -- << Le scanner >> -- //
    Scanner sc = new Scanner(System.in);
    // liste de méthodes :
    // > nextLine()
    // > nextChar()
    // > nextByte()
    // > nextDouble()
    // > nextFloat()
    // > nextInt()
    // > nextBoolean()

    System.out.println("Acceder à quel niveau ?"); // exemple avec un int
    int game_level = sc.nextInt();
    System.out.println(game_level);
  }

}
