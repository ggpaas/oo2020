public class Joogivaat {
    double maksimumMahutavus;
    double hetkeneSisaldus;
    String joogivaadiNimi;
    Jook joogiNimi;

    public Joogivaat(double maksimumMahutavus, String joogivaadiNimi, Jook joogiNimi) {
        this.maksimumMahutavus = maksimumMahutavus;
        this.joogivaadiNimi = joogivaadiNimi;
        this.joogiNimi = joogiNimi;
        this.hetkeneSisaldus = 0;
    }

    @Override
    public String toString() {
        return "Joogivaat{" +
                "maksimumMahutavus=" + maksimumMahutavus +
                ", hetkeneSisaldus=" + hetkeneSisaldus +
                ", joogivaadiNimi='" + joogivaadiNimi + '\'' +
                '}';
    }

    public Boolean kasSaabLisadaJooki() {
        return this.maksimumMahutavus >= this.hetkeneSisaldus + this.joogiNimi.getEriKaal();
    }

    public void lisaJook(){
        if (kasSaabLisadaJooki()) {
            this.hetkeneSisaldus += this.joogiNimi.getEriKaal();
            System.out.println("[info] Lisasime Joogi");
        } else {
            System.out.println("[info] Ei Saa Lisada");
        }
    }
}