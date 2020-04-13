
public class Child extends Parant{

    public Child(String name, String job){
        super(name, job);
        this.isIndependent = false;
    }

    public void speak(){
        super.speak();
        System.out.println("\nTereeeee");
    }
}