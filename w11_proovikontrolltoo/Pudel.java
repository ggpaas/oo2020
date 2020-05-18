public class Pudel {

    double maht;
    String tüüp;
    double mass;
    double maksumus;
    Jook jook;

    public Pudel(double maht, String tüüp, double mass, double maksumus, Jook jook) {
        this.maht = maht;
        this.tüüp = tüüp;
        this.mass = mass;
        this.maksumus = maksumus;
        this.jook = jook;
    }

    public double getPudeliMass() {
        double pudeliMass = this.mass + this.jook.eriKaal * this.maht;
        return pudeliMass;
    }

    public double getPudeliHind() {
        double pudeliHind = this.maht * this.jook.liitriHind + this.maksumus;
        return pudeliHind;
    }
}