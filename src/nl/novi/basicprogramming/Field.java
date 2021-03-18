package nl.novi.basicprogramming;

public class Field {
    // variabelen
    private String token;
    private boolean isOccupied;

    // constructor
    public Field(String token) {
        this.token = token;
        this.isOccupied = false;
    }

    //methodes
    public void setToken(String token) {
        if (!isOccupied) {
            this.token = token;
        }
        isOccupied = true;
    }

    public String getToken() {
        return token;
    }

}
