/**
 * Parant
 */
public class Parant {

    public String name;
    public String job;
    
    public boolean isIndependent;

    public int legSlot = 2;
    public int armSlot = 2;

    public Parant(String name, String job){
        this.name = name;
        this.job = job;
        this.isIndependent = true;
    }

    public void speak(){
        System.out.println("My name is "+ this.name + " and my job is "+ this.job + " and is independent " + this.isIndependent);
    }
}