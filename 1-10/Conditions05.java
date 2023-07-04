public class Conditions05 {
  public static void main(String[] args) {
  
    int value = 24;

    if (value == 24) {
      System.out.println("value = 24");
    }
    if (value == 16) {
      System.out.println("value = 16");
    }
    if (value == 24 || value == 16) {
      System.out.println("value = 16 OU value = 24");
    } else {
      System.out.println("value != 16 ET value != 24");
    }

    if (value < 0) {
      System.out.println("value est inférieure à 0");
    } else if (value > 0) {
      System.out.println("value est suppérieure à 0");
    }


    // le switch

    int option = 1;

    switch (option) {
      case 0: /* if option == 1, donc ne vérifie pas le type */
        System.out.println("option égal 0");
        break; // sort du switch
      case 1:
        System.out.println("option égal 0");
        break; // sort du switch
      default: // default = else
        System.out.println("option != 0 && option != 1");
        break;
    }

  }
}
