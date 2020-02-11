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
        Character gevin = new Character("Gevin", CharacterType.WARRIOR);
        
        gevin.slogan = "AYO";

        System.out.println(gevin);
    }

}