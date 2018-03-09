package gson.objects;

import com.google.gson.JsonObject;

public class AddressGson {

    JsonObject address = new JsonObject();

    public JsonObject getAddress() {
        return address;
    }

    public void setAddress(JsonObject address) {
        this.address = address;
    }

    public String getStreet() {
        return address.get("street").getAsString();
    }

    public void setStreet(String street) {
        address.addProperty("street", street);
    }

    // other getters and setters for Address fields
    // ...

    public String getCustomStringField(String fieldName) {
        return address.get(fieldName).getAsString();
    }

    public void setCustomStringField(String fieldName, String value) {
        address.addProperty(fieldName, value);
    }

}


