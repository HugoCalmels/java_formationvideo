public class Operateurs04 {
  /*
   [NOTES]
   
   = Affectation
   + Concaténation
  
   opérateurs arithmétiques : + - * / % ( )
  
   opérateurs de comparaison :
   == la valeur
   === la valeur et le type
   != différent de
   <
   <= 
   >
   >= 
   !true = false 
   != opérateur de négation
    
   opérateurs raccourcis :
   A = A + x --> A += x
  += ajouter
  -= division
  *= multiplier
  /= diviser
  %= modulo 
  
  A++ post-incrémentation | A-- post-décrementation --> A = A + 1 --> plus lent ( une opératio en plus )
  ++A pre-incrémentation | --A pre-décrementation --> A = (A + 1) --> plus rapide 
   
   */
  public static void main(String[] args) {
    int age = 25;
    int result = age;

    System.out.println("tu as" + age + "ans.");
    System.out.println(result);

    /////////////////////

    int experience = 0;

    experience = 10;
    experience += 100;

    System.out.println(experience);

    ////////////////////

    int nb1 = 1;
    int nb2 = nb1++;
    // tu mets 1 dans nb2, et ensuite tu incrementes nb2
    // post-incrementation
    System.out.println("nb1 = "+nb1); // --> nb1 = 2
    System.out.println("nb2 = " + nb2); // --> nb2 = 1
    
    int nb11 = 1;
    int nb22 = ++nb11;
    // nb1 += 1 et ensuite nb2 = nb1
  // pre-incrementation
    System.out.println("nb1 = "+nb11); // --> nb1 = 2
    System.out.println("nb2 = " + nb22); // --> nb2 = 2
    
    //////////////////////////

    boolean result2 = 14 < 25;

    System.out.println("result2 = " + result2);
  }
}
