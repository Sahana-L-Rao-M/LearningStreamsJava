package Streams;

public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public Address(String city) {
        this.city = city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    private String company;

    public Address(String city, String company) {
        this.city = city;
        this.company = company;
    }
}
