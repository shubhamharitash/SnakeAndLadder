package service;

import dto.Player;
import repository.PlayerRepository;

import java.util.Map;
import java.util.Scanner;

public class PlayerService {
   static void initializePlayerService(Scanner scanner){
        PlayerRepository playerRepository=new PlayerRepository();
        Map<String, Player> playerMap=playerRepository.getPlayerMap();
        System.out.println("Enter Number of Players");
        int playerNum=scanner.nextInt();
        scanner.nextLine();
        while ((playerNum--)>0){
            String playerName=scanner.nextLine();
            Player player=new Player(playerName,0);
            playerMap.put(playerName,player);
        }
    }
}
