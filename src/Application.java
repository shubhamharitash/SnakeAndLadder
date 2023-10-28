import dto.Player;
import repository.LadderRepository;
import repository.PlayerRepository;
import repository.SnakeRepository;
import service.BoardService;
import service.InMemoryService;
import service.LadderService;
import service.SnakeService;

import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        InMemoryService inmemory=new InMemoryService(scanner);
        BoardService boardService=new BoardService();
        try {
            boardService.startGame();
        }
        catch (Exception e){
            System.out.println(e);
        }
}
}
