package objectMapping.objects;

public class Address {

    private String street;
    private Integer house;
    private Integer apt;
    private String city;
    private String zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address withStreet(String street) {
        this.street = street;
        return this;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Address withHouse(Integer house) {
        this.house = house;
        return this;
    }

    public Integer getApt() {
        return apt;
    }

    public void setApt(Integer apt) {
        this.apt = apt;
    }

    public Address withApt(Integer apt) {
        this.apt = apt;
        return this;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Address withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

}
