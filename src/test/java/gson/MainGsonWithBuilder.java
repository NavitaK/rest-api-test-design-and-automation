package gson;

import gson.builder.AddressBuilder;
import gson.objects.Address;

public class MainGsonWithBuilder {

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet(null);
        address.setCustomStringField("unknownProperty", "value");
        address.setStreet("Kolasa");

        if (address.hasStreet()) {
            System.out.println(address.getStreet());
        }
        if (address.hasCustomStringField("unknownProperty")) {
            System.out.println(address.getCustomStringField("unknownProperty"));
        }

        Address address2 = new AddressBuilder().withRequiredFieldsOnly().build();
        if (address2.hasStreet()) {
            System.out.println(address2.getStreet());
        }

        Address address3 = new AddressBuilder().withAllFields().build();
        if (address3.hasStreet()) {
            System.out.println(address3.getStreet());
        }
    }

}
