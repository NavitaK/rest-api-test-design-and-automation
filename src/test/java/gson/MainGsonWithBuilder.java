package gson;

import gson.builder.AddressBuilder;
import gson.objects.Address;

public class MainGsonWithBuilder {

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet(null);
        address.setCustomStringField("unknownProperty", "value");
        address.setStreet("Kolasa");

        System.out.println(address.getStreet());
        System.out.println(address.getCustomStringField("unknownProperty"));

        Address address2 = new AddressBuilder().withRequiredFieldsOnly().build();
        System.out.println(address2.getStreet());

        Address address3 = new AddressBuilder().withAllFields().build();
        System.out.println(address3.getStreet());
    }

}
