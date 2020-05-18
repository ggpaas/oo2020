public class Jook {
    String name;
    double liitriHind;
    double eriKaal;

    /**
     * @param name -> Joogi nimi
     * @param liitriHind -> Joogi liitri Hind
     * @param eriKaal -> Siit saab erakaalus
     */
    public Jook(String name, double liitriHind, double eriKaal) {
        this.name = name;
        this.liitriHind = liitriHind;
        this.eriKaal = eriKaal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLiitriHind() {
        return liitriHind;
    }

    public void setLiitriHind(double liitriHind) {
        this.liitriHind = liitriHind;
    }

    public double getEriKaal() {
        return eriKaal;
    }

    public void setEriKaal(double eriKaal) {
        this.eriKaal = eriKaal;
    }
}