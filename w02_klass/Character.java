/**
 * Charater
 */
public class Character {

    private int x;
    private int y;
    
    String slogan = "";

    private String name;
    private CharacterType characterType;
    private Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;
    }
    
    @Override
    public String toString(){
        return "my name is" + name + "and i am at x:" + x + "y" + y;
    }
}