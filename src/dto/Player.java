package dto;

public class Player {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrPos() {
        return currPos;
    }

    public void setCurrPos(int currPos) {
        this.currPos = currPos;
    }

    public Player(String name, int currPos) {
        this.name = name;
        this.currPos = currPos;
    }

    int currPos;
}
