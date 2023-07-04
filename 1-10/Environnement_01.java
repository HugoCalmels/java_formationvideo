

class Environnement_01 { // nom du fichier
  public static void main(String[] args) {
    // public static void main(String[] args)
    // main = fonction de démarrage du programme, obligatoire, et prend éventuellement des arguments
    // main(String[] args) obligatoire meme s'il n'y a pas d'arguments 
    // void = prend le type du retour // void = aucun retour
    // static = le moyen d'access, de portée // nice !
    // public = domaine d'accessibilité, donc acccessible hors classe

    // résumé lié à "static" :
    // static -> apparatient à la classe elle meme plutot qu'à une instance de la classe.
    // final -> ne peut etre modifié ( donc comme "const" en JS )
    // abstract -> déclartion abstraite qui etre implémentée dans les sous classes.
    // synchronized -> pour synchroniser des parties critiques du code, afin d'éviter 
    // des problemes de concurence dans les threads
    // volatile -> pour indiquer que la valeur peut etre modifiée par plusieurs threads, incluant que
    // les threads doivent etre utilisés à chaque utilisation

    // un thread c'est  quoi d'ailleurs ?
    // -> un thread est une séquence d'éxécution qui peut etre exécutée de manière indépendante ou
    // concurrente avec d'autres threads au sein d'un même programme.
    // Un programme Java peut exécuter plusieurs threads en même temps permettant 
    // l'éxécution de tâches multiples
    // 1. un processus -> Instance d'un programme en cours d'éxécution sur un systeme d'exploitation.
    // Chaque processus a son propre espace mémoire et ses ressources. Un processus peut contenier un ou plusieurs threads.
    // 2. thread -> Un thread ( "fil" de traduction pure ) est une unité d'exécution légère à l'intérieur 
    // d'un processus. Chaque thread a son propre registre de piles, mais il peut accéder aux
    // variables et ressources partagées par les autres threads du processus.
    // 2.1 pile -> Pile ( ou stack en anglais ) est une structure de données utilisée dans la prog
    // pour gérer l'allocation de mémoire et le suivi des appels de fonctions ou des méthodes.
    // 3. multithreading -> capacité d'un prog à éxécuter plusieurs threads simulténament.
    // permet d'exploiter les ressources matérielles disponibles de manière plus efficace.
    // concurrence -> se produit lorsque plusieurs tthreads s'éxécentent simultanément et accèdent aux
    // mêmes ressources partagées. Sa gestion est essentielle pour éviter les problemes de course critique
    // et les conflits aux données partagées.

    // résumé lié à "public"
    // public -> l'élément est accessible de n'importe ou, à la fois à l'intérieur de la classe et en dehors 
    // protected -> l'élement est accessible dans la classe, dans les classes du meme package,
    // et dans les sous-classes.
    // private -> l'élément est accessible uniquement dans la classe elle meme, et il est innaccessible
    // en dehors de la classe et dans les sous classes.
    // default -> ( si ne met rien ) portée par défaut. accessible dans la classe elle meme,
    // et dans les classes du même paquetage.



    System.out.println("Hello world");
    // System = classe native de Java
    // out = attribut qui appartient à une autre classe
    // println = fonction de la classe out, en gros un console.log

    // SUITE 
    // $ javac variables.java 
    // ==> ca crée un fichier .class
    // $ java variables , ou $ java variables.class
    // ==> BOOOM "Hello world" dans le terminal
  }
}