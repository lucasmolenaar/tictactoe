package nl.novi.basicprogramming;

public class Player {
    // attributen
    private String name;
    private String token;
    private int score;

    // constructor
    public Player(String name, String token) {
        this.name = name;
        this.token = token;
        this.score = 0;
    }

    // methodes
    public String getName() {
        return name;
    }

    public String getToken() {
        return token;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int extraPoints) {
        score += extraPoints;
    }
}
