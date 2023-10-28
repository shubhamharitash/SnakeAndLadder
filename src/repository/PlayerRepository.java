package repository;

import dto.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerRepository {


    public static Map<String, Player> getPlayerMap() {
        return playerMap;
    }

    public PlayerRepository() {
        playerMap = new HashMap<>();
    }

    static Map<String,Player> playerMap;
}
