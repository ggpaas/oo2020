public class Human{

    private String name;
    private String gender;
    private int legs;
    private int hands;
    private String skincolor;
    private int age;

    public Human(String name, String gender, int legs, int hands, String skincolor, int age){
        this.name = name;
        this.gender = gender;
        this.legs = legs;
        this.hands = hands;
        this.skincolor = skincolor;
        this.age = age;

    }
        
    @Override
    public String toString(){
        return "my name is " + name + " and my gender is " + gender + ". I have " + legs + " legs and " + hands +
         " hands. My skin color is " + skincolor + " and I am "+ age+ " years old!";
    }

}