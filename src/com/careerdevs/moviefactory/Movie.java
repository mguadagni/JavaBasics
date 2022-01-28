package com.careerdevs.moviefactory;

public class Movie {
    public String movieName;
    public String movieDirector;
    public int runTimeInMin;
    public boolean hasBeenReleased;

    public Movie(String movieName, String movieDirector, int runTimeInMin, boolean hasBeenReleased) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.runTimeInMin = runTimeInMin;
        this.hasBeenReleased = hasBeenReleased;
    }

    @Override
    public String toString() {
        return "Movie\n" +
                "movieName = " + movieName +
                ", movieDirector = " + movieDirector +
                ", runTimeInMin = " + runTimeInMin +
                ", hasBeenReleased = " + hasBeenReleased;
    }
}
