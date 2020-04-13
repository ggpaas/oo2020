package eu.gevin.java;

/**
 * Hello world!
 *
 */
public class App {

    private String name;

    public App(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int maxValue(int a, int b){
        return a > b ? a : b;
    }
    public static void main(String[] args){
        System.out.println( "Hello World!" );
    }

	public Object getContact() {
		return null;
	}
}
