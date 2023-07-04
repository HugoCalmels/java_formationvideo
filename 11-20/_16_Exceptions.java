import java.util.Scanner;
import java.util.InputMismatchException;

// en gros : regarder quand on utilise une classe ou une méthode si elle peut lever des exceptions
// sur la doc c'est marqué la liste des exceptions levées liées à une methode/classe

public class _16_Exceptions {
  // les Exceptions est une maniere dans les langages POO pour pouvoir gérer des erreurs
  public static void main(String[] args) {
    // A utiliser si et seulement si il y a un risque d'erreur.

    Scanner sc = new Scanner(System.in);

    try{ // comme un bloc if/else --> si tout se passe bien, on ne catch PAS
      System.out.println("Anee de naissance");
      int yearOfBirth = sc.nextInt();
      System.out.println(yearOfBirth);
    } 
    catch (InputMismatchException e) {
      // englober l'exception dans une variable
      System.out.println("La date de naissance est incorrecte.");
      // bah ui : le type

      // --> Afficher l'execption :
      e.printStackTrace(); // --> Erreur en détail, affichage de la ligne de l'erreur
      // Affiche le message d'erreur :
      System.out.println("ERREUR :" + e.getMessage());
    }
    // on peut cumuler les catch
    catch (randomName e) {
      // possiblement d'autres exceptions que InputMissmatchException
    }
    finally { // optionnel
      // peu importe qu'une exception soit levée ou pas
      // peu importe le scenario
      // on fera ce qui est dans le bloc finally
    }
  }
}
