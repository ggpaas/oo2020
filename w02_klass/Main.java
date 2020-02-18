/**
 * Main
 */
public class Main {

   /* public static void main(String[] args) {
        PersonalCode gevinCode = new PersonalCode();
        gevinCode.setCode("45005050505");
        System.out.println(gevinCode.gender());
        System.out.println(gevinCode.gender());

        System.out.println(gevinCode);
    }
  */
    public static void main(String[]args){
        //Character gevin = new Character("Gevin", CharacterType.WARRIOR);
        Human humanCode = new Human("Nibba", "male", 2, 2, "black", 69);
        Map gamecode = new Map("Narva str", "NY", 42, "Brazil", "east side");
        
        //gevin.slogan = "AYO";

        //System.out.println(gevin);
        System.out.println(humanCode);
        System.out.println(gamecode);
    }
}