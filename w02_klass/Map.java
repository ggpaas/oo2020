public class Map {

    private String street;
    private String city;
    private int streetnumber;
    private String country;
    private String district;

    public Map(String street, String city, int streetnumber, String country, String district){

        this.street = street;
        this.city = city;
        this.streetnumber = streetnumber;
        this.country = country;
        this.district = district;
    }
    @Override
    public String toString(){
        return "My aadress is " + city + " , " + street + " " + streetnumber + " it is in " + country +
         " and the area is " + district;
    }
}