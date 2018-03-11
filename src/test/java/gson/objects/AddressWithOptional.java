package gson.objects;

import com.google.gson.JsonElement;

import java.util.Optional;

public class AddressWithOptional extends DomainObjectWithOptional {

    public static final String STREET_FIELD = "street";

    public Optional<String> getStreet() {
        JsonElement streetElement = jsonObject.get(STREET_FIELD);
        return streetElement.isJsonNull() ? Optional.empty(): Optional.of(streetElement.getAsString());
    }

    public void setStreet(String street) {
        jsonObject.addProperty(STREET_FIELD, street);
    }

    // other getters and setters for Address fields
    // ...

}
