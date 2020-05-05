public class Child implements People {

    @Override
    public void sleep() {
        System.out.println("zzz");
    }

    @Override
    public void eat() {
        System.out.println("Nämmnämm");
    }

    @Override
    public void talk() {
        System.out.println("Gugu Gaga");
    }
}