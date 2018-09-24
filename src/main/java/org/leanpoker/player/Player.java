package org.leanpoker.player;

import com.google.gson.JsonElement;

import java.util.Map;

public class Player {

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        return request.getAsJsonObject().get("small_blind").getAsInt();
    }

    public static void showdown(JsonElement game) {
    }
}
