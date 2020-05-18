

public class Main {
    public static void main(String[] args) {
        Jook vodka = new Jook("V0dka", 2.5, 2.5);
        Pudel vodkaBottle = new Pudel(2.5, "Glass", 2.5, 1.3, vodka);
        Joogivaat viinaVaat = new Joogivaat(10, "Viina Vaat", vodka);

        viinaVaat.lisaJook();
        viinaVaat.lisaJook();
        viinaVaat.lisaJook();
        viinaVaat.lisaJook();
        viinaVaat.lisaJook();
        System.out.println(viinaVaat);
    }
}
