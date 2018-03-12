package gson.objects;

public class Address extends DomainObject {

    public static final String STREET_FIELD = "street";

    public boolean hasStreet() {
        return jsonObject.has(STREET_FIELD);
    }

    public String getStreet() {
        return jsonObject.get(STREET_FIELD).isJsonNull() ? null: jsonObject.get(STREET_FIELD).getAsString();
    }

    public void setStreet(String street) {
        jsonObject.addProperty(STREET_FIELD, street);
    }

    // other getters and setters for Address fields
    // ...

}


