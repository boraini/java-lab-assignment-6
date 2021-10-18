package labassignment5;

import java.util.Objects;

class Address {
    private String street;
    private int number;
    private String zipCode;
    private String city;

    public Address(String street, int number, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String toString() {
        return String.format("<Address: %s %d, %s %s>", street, number, zipCode, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return number == address.number && Objects.equals(street, address.street) && Objects.equals(zipCode, address.zipCode) && Objects.equals(city, address.city);
    }
}
