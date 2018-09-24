package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Java player V0.5";

    public static int betRequest(JsonElement request) {
        JsonElement names = request.getAsJsonObject().getAsJsonArray("players");
        JsonElement round = request.getAsJsonObject().getAsJsonPrimitive("round");
        JsonElement betIndex = request.getAsJsonObject().getAsJsonPrimitive("bet_index");
        JsonElement cards = request.getAsJsonObject().getAsJsonArray("players").get(3).getAsJsonObject().get("hole_cards");
        System.err.println("NAMES              "+ names);
        System.err.println("CARDS :            "+ cards);
        System.err.println("ROUND :            "+ round);
        System.err.println("BET INDEX: "+ betIndex);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
