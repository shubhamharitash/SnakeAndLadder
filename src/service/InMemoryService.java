package service;

import repository.SnakeRepository;

import java.util.Scanner;

public class InMemoryService {
    public InMemoryService(Scanner scanner) {
        SnakeService.initializeSnakeRepository(scanner);
        LadderService.initializeLadderRepository(scanner);
        PlayerService.initializePlayerService(scanner);
        BoardService.initializeBoard(scanner);
    }
}
