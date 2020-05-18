

class PudelTest {
    Pudel vodkaBottle;
    Jook vodka;

    @BeforeEach
    void setUp() {
        vodka = new Jook("V0dka", 2.5, 2.5);
        vodkaBottle = new Pudel(2.5, "Glass", 2.5, 1.3, vodka);
    }

    @Test
    void getPudeliMass() {
        assertEquals(8.75, vodkaBottle.getPudeliMass());
    }

    private void assertEquals(double d, double pudeliMass) {
    }

    @Test
    void getPudeliHind() {
    }
}