package gson.builder;

import gson.objects.AddressWithOptional;

import java.util.Random;

public class AddressBuilderWithOptional {

    AddressWithOptional address = new AddressWithOptional();

    public AddressBuilderWithOptional withRequiredFieldsOnly() {
        address.setStreet("Kolasa");
        return this;
    }

    public AddressBuilderWithOptional withAllFields() {
        withRequiredFieldsOnly();
        // add the rest of the fields
        // ...
        return this;
    }

    // builder methods that add one field at a time.
    // ...

    public AddressWithOptional build() {
        return address;
    }

    public int generateRandomId() {
        int min = 1;
        int max = 1000000;
        return new Random().nextInt((max - min) + 1) + min;
    }

}
