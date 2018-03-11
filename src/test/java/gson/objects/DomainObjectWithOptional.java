package gson.objects;

import com.google.gson.JsonElement;
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

    public Optional<String> getCustomStringField(String fieldName) {
        JsonElement customFieldElement = jsonObject.get(fieldName);
        return customFieldElement.isJsonNull() ? Optional.empty(): Optional.of(customFieldElement.getAsString());
    }

    public void setCustomStringField(String fieldName, String value) {
        jsonObject.addProperty(fieldName, value);
    }

}
