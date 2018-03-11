package gson.objects;

public class Address extends DomainObject {

    public String getStreet() {
        return jsonObject.get("street").getAsString();
    }

    public void setStreet(String street) {
        jsonObject.addProperty("street", street);
    }

    // other getters and setters for Address fields
    // ...

    public String getCustomStringField(String fieldName) {
        return jsonObject.get(fieldName).getAsString();
    }

    public void setCustomStringField(String fieldName, String value) {
        jsonObject.addProperty(fieldName, value);
    }

}
