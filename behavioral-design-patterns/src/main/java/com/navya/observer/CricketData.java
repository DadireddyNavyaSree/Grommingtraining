package com.navya.observer;

public class CricketData {
    int runs, wickets;
    float overs;
    CurrentScoreDisplay currentScoreDisplay;
    AverageScoreDisplay averageScoreDisplay;

    // Constructor
    public CricketData(CurrentScoreDisplay currentScoreDisplay,
                       AverageScoreDisplay averageScoreDisplay)
    {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
    }


    private int getLatestRuns()
    {

        return 90;
    }


    private int getLatestWickets()
    {

        return 2;
    }


    private float getLatestOvers()
    {

        return (float)10.2;
    }

    // This method is used update displays when data changes
    public void dataChanged()
    {
        // get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        currentScoreDisplay.update(runs,wickets,overs);
        averageScoreDisplay.update(runs,wickets,overs);
    }
}
