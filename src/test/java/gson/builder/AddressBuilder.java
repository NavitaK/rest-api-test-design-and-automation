package gson.builder;

import gson.objects.Address;

import java.util.Random;

public class AddressBuilder {

    Address address = new Address();

    public AddressBuilder withRequiredFieldsOnly() {
        address.setStreet("Kolasa");
        return this;
    }

    public AddressBuilder withAllFields() {
        withRequiredFieldsOnly();
        // add the rest of the fields
        // ...
        return this;
    }

    // builder methods that add one field at a time.
    // ...

    public Address build() {
        return address;
    }

    public int generateRandomId() {
        int min = 1;
        int max = 1000000;
        return new Random().nextInt((max - min) + 1) + min;
    }

}
