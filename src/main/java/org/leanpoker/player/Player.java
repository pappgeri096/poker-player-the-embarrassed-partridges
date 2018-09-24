package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonElement names = request.getAsJsonObject().getAsJsonArray("players");
        JsonElement round = request.getAsJsonObject().getAsJsonPrimitive("round");
        JsonElement cards = request.getAsJsonObject().getAsJsonArray("players").get(3).getAsJsonObject().get("hole_cards");

        for(Map.Entry<String, JsonElement> entry : cards.getAsJsonObject().entrySet()) {
            System.err.println("Key = " + entry.getKey() + " Value = " + entry.getValue() );
        }

        System.err.println("NAMES              "+ names);
        System.err.println("CARDS :            "+ cards);
        System.err.println("ROUND :            "+ round);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
