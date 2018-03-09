package gson.builder;

import gson.objects.AddressGson;

import java.util.Random;

public class AddressGsonBuilder {

    AddressGson address = new AddressGson();

    public AddressGsonBuilder withRequiredFieldsOnly() {
        address.setStreet("Kolasa");
        return this;
    }

    public AddressGsonBuilder withAllFields() {
        withRequiredFieldsOnly();
        // add the rest of the fields
        // ...
        return this;
    }

    // builder methods that add one field at a time.
    // ...

    public AddressGson build() {
        return address;
    }

    public int generateRandomId() {
        int min = 1;
        int max = 1000000;
        return new Random().nextInt((max - min) + 1) + min;
    }

}



