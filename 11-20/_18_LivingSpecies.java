abstract public class _18_LivingSpecies {
  // classe abstraite .. qchose de tres vague, dur à définir.
  // d'ou le mot clef : abstract

  // note : une classe est abstraite si minimum UNE de ses méthodes est abstraite aussi

  // note 2 : on ne peut pas créer d'instance d'une classe abstraite, et elle ne possede pas de constructor

  protected String mName;
  
  public String whoAmI() {
    return mName;
  }

  abstract public void eat();

  abstract public void speak();
}
