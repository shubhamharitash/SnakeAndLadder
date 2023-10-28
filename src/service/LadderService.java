package service;

import repository.LadderRepository;
import repository.SnakeRepository;

import java.util.Map;
import java.util.Scanner;

public class LadderService {

  static   boolean isLadderPos(int Pos){
        if (LadderRepository.getStartLastMap().containsKey(Pos))
            return true;
        else
            return false;
    }
   static int reachLadderTop(int Pos){
        return LadderRepository.getStartLastMap().get(Pos);
    }
   static void initializeLadderRepository(Scanner scanner){
        LadderRepository ladderRepository=new LadderRepository();
        Map<Integer,Integer> ladderMap= ladderRepository.getStartLastMap();
        System.out.println("Enter Number of Ladders");
        int ladderNum=scanner.nextInt();
        scanner.nextLine();
        while ((ladderNum--)>0){
            String[] ladderPos=scanner.nextLine().split(" ");
            int start=Integer.parseInt(ladderPos[0]);
            int end=Integer.parseInt(ladderPos[1]);
            ladderMap.put(start,end);
        }
    }
}
