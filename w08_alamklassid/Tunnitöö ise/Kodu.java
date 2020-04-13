
public class Kodu extends Vara{
    public int tk = 1;
    public String vanus = "vana";

    
    public void kallis() {
        super.kallis();
        uusVõiVana();
        System.out.println("Vaja osta uus maja");
    }

    @Override
    public void mituTK() {
        // TODO Auto-generated method stub
        System.out.println("Maju on : " + this.tk);

    }

    @Override
    public void uusVõiVana() {
        // TODO Auto-generated method stub
        System.out.println("Maja on : " + this.vanus);

    }

}