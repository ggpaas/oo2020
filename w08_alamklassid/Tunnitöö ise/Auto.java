
public class Auto extends Vara{
    public int kohti = 4;
    public int tk = 2;
    public String vanus = "uus";


    @Override
    public void mituTK() {
        // TODO Auto-generated method stub
        System.out.println("Autosid on : " + this.tk);

    }

    @Override
    public void uusVõiVana() {
        // TODO Auto-generated method stub
        System.out.println("auto on : " + this.vanus);

    }
    

}