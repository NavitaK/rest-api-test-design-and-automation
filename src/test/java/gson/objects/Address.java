package gson.objects;

import com.google.gson.JsonElement;

public class Address extends DomainObject {

    public static final String STREET_FIELD = "street";

    public String getStreet() {
        JsonElement streetElement = jsonObject.get(STREET_FIELD);
        return streetElement.isJsonNull() ? null: streetElement.getAsString();
    }

    public void setStreet(String street) {
        jsonObject.addProperty(STREET_FIELD, street);
    }

    // other getters and setters for Address fields
    // ...

}
