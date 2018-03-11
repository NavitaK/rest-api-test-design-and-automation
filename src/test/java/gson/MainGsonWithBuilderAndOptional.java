package gson;

import gson.builder.AddressBuilderWithOptional;
import gson.objects.AddressWithOptional;
import org.testng.TestNGException;

public class MainGsonWithBuilderAndOptional {

    public static void main(String[] args) {
        AddressWithOptional address = new AddressWithOptional();
        address.setStreet(null);
        address.setCustomStringField("unknownProperty", "value");
        address.setStreet("Kolasa");

        if (address.hasStreet()) {
            System.out.println(address.getStreet().orElseThrow(() -> new TestNGException("Street not set")));
        }
        if (address.hasCustomStringField("unknownProperty")) {
            System.out.println(address.getCustomStringField("unknownProperty").orElseThrow(
                () -> new TestNGException("CustomField not set")));
        }

        AddressWithOptional address2 = new AddressBuilderWithOptional().withRequiredFieldsOnly().build();
        if (address.hasStreet()) {
            System.out.println(address2.getStreet().orElseThrow(() -> new TestNGException("Street not set")));
        }

        AddressWithOptional address3 = new AddressBuilderWithOptional().withAllFields().build();
        if (address.hasStreet()) {
            System.out.println(address3.getStreet().orElseThrow(() -> new TestNGException("Street not set")));
        }
    }

}
