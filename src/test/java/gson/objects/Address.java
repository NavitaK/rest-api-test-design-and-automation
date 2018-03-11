package gson.objects;

import com.google.gson.JsonElement;

public class Address extends DomainObject {

    public String getStreet() {
        JsonElement streetElement = jsonObject.get("street");
        return streetElement.isJsonNull() ? null: streetElement.getAsString();
    }

    public void setStreet(String street) {
        jsonObject.addProperty("street", street);
    }

    // other getters and setters for Address fields
    // ...

}
