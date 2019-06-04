package com.example.source.fczatona;

public class Player {

    private String playerName, playerPosition, palyerImageUrl;
    private int playerAge, playerGoals;

    public Player() {
    }

    public Player(String playerName, String playerPosition, String palyerImageUrl, int playerAge, int playerGoals) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.palyerImageUrl = palyerImageUrl;
        this.playerAge = playerAge;
        this.playerGoals = playerGoals;
    }

    public String getPalyerImageUrl() {
        return palyerImageUrl;
    }

    public void setPalyerImageUrl(String palyerImageUrl) {
        this.palyerImageUrl = palyerImageUrl;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerGoals(int playerGoals) {
        this.playerGoals = playerGoals;
    }
}
