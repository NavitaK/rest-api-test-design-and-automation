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

}
