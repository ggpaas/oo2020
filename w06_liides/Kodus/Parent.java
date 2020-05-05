public class Parent implements People {

    @Override
    public void sleep() {
        System.out.println("ZZZ");
    }

    @Override
    public void eat() {
        System.out.println("MMM, kui hea");
    }

    @Override
    public void talk() {
        System.out.println("Pane riidesse");
    }
}