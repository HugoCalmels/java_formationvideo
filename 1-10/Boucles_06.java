public class Boucles_06 {
  public static void main(String[] args) {
  
    int i = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 1;

    while (i != 10) {
      System.out.println("i = " + i);
      // la boucle infinie X_X
      i++;
      // réglé la boucle infinie
    }

    while (i2 != 10) {
      System.out.println("AVEC UN BREAK : i = " + i2);
      // break; 1x break ici donnera seulement 1x loop 
      if (i2 == 5) {
        break; // on sort du loop a i = 5
      }
      i2++;
    }

    while (i3 != 10) {
      i3++;
      if (i3 == 5) {
        continue; // revient au début de la boucle
      }
      System.out.println("AVEC UN CONTINUE : i = " + i3);
    }

    // boucle inversée 
    do
    { // fera au minimum une fois ce qu'il y a dans la boucle
      i4++;
      if (i == 5) {
        continue;
      }
      System.out.println("boucle inversée : i = " + i4);
    } while (i4 != 10);


    //// --- Boucle FOR --- ////

    for (int z = 0; z != 10; z++) {
      
    }
  }
}
