
public class Main {
    public static void main(String[] args) {
        Child child = new Child("GUGU", "Going to school");

        System.out.println(
            child.armSlot + " "+
            child.legSlot +" " 
        );
       

        System.out.println(child.name + " " + child.job);
        
        child.speak();
    }

}