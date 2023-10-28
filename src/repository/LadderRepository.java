package repository;

import dto.Ladder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LadderRepository {

    public static Map<Integer, Integer> getStartLastMap() {
        return startLastMap;
    }

    public LadderRepository() {
        startLastMap = new HashMap<>();

    }

   static Map<Integer,Integer> startLastMap;
}
