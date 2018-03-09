package gson;

import com.google.gson.JsonObject;

public class MainGson {

    public static void main(String[] args) {

        JsonObject userAddress = new JsonObject();
        userAddress.addProperty("street", "Kolasa");
        userAddress.add("house", null);
        userAddress.addProperty("unknownProperty", "value");
        userAddress.addProperty("house", 5);

        System.out.println(userAddress.get("street").getAsString());
        System.out.println(userAddress.get("house").getAsInt());

    }

}
