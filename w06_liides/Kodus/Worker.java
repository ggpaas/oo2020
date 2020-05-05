public class Worker implements People {

    @Override
    public void sleep() {
        System.out.println("ZzZz");
    }

    @Override
    public void eat() {
        System.out.println("Mul pole aega");
    }

    @Override
    public void talk() {
        System.out.println("50k on liiga vähe");
    }
}