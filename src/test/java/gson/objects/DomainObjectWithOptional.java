package gson.objects;

import com.google.gson.JsonObject;

import java.util.Optional;

public abstract class DomainObjectWithOptional {

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

    public Optional<String> getCustomStringField(String fieldName) {
        return jsonObject.get(fieldName).isJsonNull() ? Optional.empty():
            Optional.of(jsonObject.get(fieldName).getAsString());
    }

    public void setCustomStringField(String fieldName, String value) {
        jsonObject.addProperty(fieldName, value);
    }

}
