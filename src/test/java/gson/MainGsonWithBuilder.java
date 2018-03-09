package gson;

import gson.builder.AddressGsonBuilder;
import gson.objects.AddressGson;

public class MainGsonWithBuilder {

    public static void main(String[] args) {

        AddressGson address = new AddressGson();
        address.setStreet(null);
        address.setCustomStringField("unknownProperty", "value");
        address.setStreet("Kolasa");

        System.out.println(address.getStreet());
        System.out.println(address.getCustomStringField("unknownProperty"));

        AddressGson address2 = new AddressGsonBuilder().withRequiredFieldsOnly().build();
        System.out.println(address2.getStreet());

        AddressGson address3 = new AddressGsonBuilder().withAllFields().build();
        System.out.println(address3.getStreet());

    }

}
