package gson.objects;

import com.google.gson.JsonObject;

public abstract class DomainObject {

    protected JsonObject jsonObject = new JsonObject();

    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public boolean hasCustomStringField(String fieldName) {
        return jsonObject.has(fieldName);
    }

    public String getCustomStringField(String fieldName) {
        return jsonObject.get(fieldName).isJsonNull() ? null: jsonObject.get(fieldName).getAsString();
    }

    public void setCustomStringField(String fieldName, String value) {
        jsonObject.addProperty(fieldName, value);
    }

}
