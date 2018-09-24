package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "Java player V0.1";

    public static int betRequest(JsonElement request) {
        JsonElement names = request.getAsJsonObject().getAsJsonArray("players");
        JsonElement communityCards = request.getAsJsonObject().getAsJsonArray("community_cards");
        JsonElement cards = request.getAsJsonObject().getAsJsonArray("players").get(0).getAsJsonObject().get("hole_cards");
        System.err.println("NAMES              "+ names);
        System.err.println("CARDS :            "+ cards);
        System.err.println("Community Cards: " + communityCards);

        return 0;
    }

    public static void showdown(JsonElement game) {
    }
}
