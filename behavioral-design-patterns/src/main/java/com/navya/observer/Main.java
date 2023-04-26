package com.navya.observer;

public class Main {
    public static void main(String[] args) {
        AverageScoreDisplay averageScoreDisplay =
                new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay =
                new CurrentScoreDisplay();

        // Pass the displays to Cricket data
        CricketData cricketData = new CricketData(currentScoreDisplay,
                averageScoreDisplay);


        // function when data changes
        cricketData.dataChanged();
    }
}
