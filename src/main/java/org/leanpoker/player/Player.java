package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        JsonElement names = request.getAsJsonObject().getAsJsonArray("players");
        JsonElement cards = request.getAsJsonObject().getAsJsonArray("players").get(0).getAsJsonObject().get("hole_cards");
        System.err.println("NAMES              "+ names);
        System.err.println("CARDS :            "+ cards);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
