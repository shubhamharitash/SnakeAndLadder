package service;

import repository.SnakeRepository;

import java.util.Map;
import java.util.Scanner;

public class SnakeService {

   static boolean isSnakePos(int Pos){
        if (SnakeRepository.getStartLastMap().containsKey(Pos))
            return true;
        else
            return false;
    }
   static   int reachSnakeTail(int Pos){
       return SnakeRepository.getStartLastMap().get(Pos);
    }
    static void initializeSnakeRepository(Scanner scanner){
        SnakeRepository snakeRepository=new SnakeRepository();
        Map<Integer,Integer> snakeMap= snakeRepository.getStartLastMap();
        System.out.println("Enter Number of Snakes");
        int snakeNum=scanner.nextInt();
        scanner.nextLine();

        while ((snakeNum--)>0){
            String[] snakePos=scanner.nextLine().trim().split(" ");
            int start=Integer.parseInt(snakePos[0]);
            int end=Integer.parseInt(snakePos[1]);
            snakeMap.put(start,end);
        }
    }
}
