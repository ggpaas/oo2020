/**
 * CharacterBehaviour
 */

// Hungarian style may be ICharacterBehaviour (I for interface)
public interface CharacterBehaviour {

    public void move();
    public void changeDirection();
    public void changeDirection(String a);
    public void speak();
    public String getName();
    int[] getXY();

}
